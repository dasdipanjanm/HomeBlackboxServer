/**
Copyright homeblackbox project to represent
All right reserved.
*/
package com.dd.contact.sync.connection.pool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import com.dd.contact.sync.connection.ConnectionCreator;
import com.dd.contact.sync.connection.ConnectionType;
import com.dd.contact.sync.connection.factory.AbstractConnectionCreatorFactory;
import com.dd.contact.sync.connection.factory.ConnectionFactoryCreator;

public final class BoundedBlockingConnectionPool  extends AbstractPool implements BlockingPool {
    
    private int mPoolSize;
    private BlockingDeque<Connection> mConnectionObjects;
    private Validator mConnectionValidator;
    private ExecutorService mExecutorService;
    private volatile AtomicBoolean mShutdownCall;
    
    {
        mExecutorService = Executors.newCachedThreadPool();
        mShutdownCall = new AtomicBoolean(false);
    }
    
    public BoundedBlockingConnectionPool(int poolSize, Validator validator) {
        this.mPoolSize = poolSize;
        this.mConnectionValidator = validator;
        this.mConnectionObjects = new LinkedBlockingDeque<Connection>(mPoolSize);
        initConnectionObjects();
    }

    private void initConnectionObjects() {
        ConnectionCreator connectionCreator = null;
        AbstractConnectionCreatorFactory factory = ConnectionFactoryCreator.createDbConnectionCreatorFactory();
        try {
            connectionCreator = factory.getConnectionCreator(ConnectionType.MYSQL);
            for (int i = 0; i < mPoolSize; i++) {
                mConnectionObjects.add(connectionCreator.getDatabaseConnection());
            }
            System.out.println("Connection Poolsize : "+mConnectionObjects.size());
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        mShutdownCall.set(false);
    }
    
   
    
    public void shutdown() {
        if (mExecutorService == null && mConnectionObjects == null) {
            return;
        }
        try {
            mShutdownCall.set(false);
            mExecutorService.shutdown();
            for (Connection con : mConnectionObjects) {
                mConnectionValidator.invalidate(con);
            }
            mConnectionObjects.clear();
            mConnectionObjects = null;
         } catch (SecurityException e) {
            e.printStackTrace();
         } catch (UnsupportedOperationException uOE) {
            uOE.printStackTrace();
         } 
       
    }

    public Connection get() {
        if (!mShutdownCall.get()) {
            Connection dbConnection = null;
            try {
                dbConnection = mConnectionObjects.take();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Connection Poolsize : "+mConnectionObjects.size());
            return dbConnection;
        }
        throw new IllegalStateException(  
                "Object pool is already shutdown");  
    }

    public Connection get(long time, TimeUnit unit) throws InterruptedException {
        if (!mShutdownCall.get()) {
            Connection dbConnection = null;
            try {
                dbConnection = mConnectionObjects.poll(time, unit);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Connection Poolsize : "+mConnectionObjects.size());
            return dbConnection;
        }
        throw new IllegalStateException(  
                "Object pool is already shutdown");  
    }

    @Override
    public void handleInvalidReturn(Connection t) {
        
    }

    @Override
    public void returnToPool(Connection connection) {
       if (mConnectionValidator != null && mConnectionValidator.isValid(connection)) {
           mExecutorService.submit(new JDBCConnectionReturner(mConnectionObjects, connection));
       }
    }

    @Override
    public boolean isValid(Connection connection) {
        return mConnectionValidator != null ? mConnectionValidator.isValid(connection) : false;
    }
    private static class JDBCConnectionReturner implements Callable<Void> {
        private BlockingQueue<Connection> mBlockingQueue;
        private Connection mConnection;
        public JDBCConnectionReturner (BlockingQueue<Connection> queue, Connection connection) {
            this.mBlockingQueue = queue;
            this.mConnection = connection;
        }
        public Void call() throws Exception {
            while (true) {
               try {
                   mBlockingQueue.put(mConnection);
                   System.out.println("Connection Poolsize : "+mBlockingQueue.size());
                   break;
               } catch (InterruptedException ie) {
                   Thread.currentThread().interrupt();  
               }
            }
            return null;
        }
    }
    @Override
    protected void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }
}
