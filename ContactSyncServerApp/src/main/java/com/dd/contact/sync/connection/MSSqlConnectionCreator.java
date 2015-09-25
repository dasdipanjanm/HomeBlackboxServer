/**
Copyright homeblackbox project to represent
All right reserved.
*/
/**
 * 
 */
package com.dd.contact.sync.connection;

import java.sql.Connection;

/**
 * @author DIPANJAN
 *
 */
public class MSSqlConnectionCreator extends ConnectionCreator {
    private static MSSqlConnectionCreator sMSSqlConnectionCreator;
    
    
    private MSSqlConnectionCreator() {
        
    }
    public static MSSqlConnectionCreator getInstance() {
        if (sMSSqlConnectionCreator == null) {
            synchronized (MSSqlConnectionCreator.class) {
                if (sMSSqlConnectionCreator == null) {
                    sMSSqlConnectionCreator = new MSSqlConnectionCreator();
                    sMSSqlConnectionCreator.initConnectionProperties();
                }
            }
        }
        return sMSSqlConnectionCreator;
    }
    @Override
    void initConnectionProperties() {
        
        
    }

    @Override
    public Connection getDatabaseConnection() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void closeDbConnection() {
        // TODO Auto-generated method stub
        
    }

}
