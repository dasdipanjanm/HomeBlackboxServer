/**
Copyright homeblackbox project to represent
All right reserved.
*/
/**
 * 
 */
package com.dd.contact.sync.connection.pool;

import com.dd.contact.sync.connection.pool.Pool.Validator;

/**
 * @author DIPANJAN
 *
 */
public class ConnectionPoolFactory {
    private ConnectionPoolFactory() {
        
    } 
    public static BlockingPool createBoundedBlockingPool(int poolSize, Validator validator) {
        return new BoundedBlockingConnectionPool(poolSize, validator);
    }
}
