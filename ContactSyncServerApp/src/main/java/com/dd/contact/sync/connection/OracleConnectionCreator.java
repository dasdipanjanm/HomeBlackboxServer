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
public class OracleConnectionCreator extends ConnectionCreator {
    private static OracleConnectionCreator sOracleConnectionCreator;
    private OracleConnectionCreator() {
        
    }
    public static OracleConnectionCreator getInstance() {
        if (sOracleConnectionCreator == null) {
            synchronized (MSSqlConnectionCreator.class) {
                if (sOracleConnectionCreator == null) {
                    sOracleConnectionCreator = new OracleConnectionCreator();
                    sOracleConnectionCreator.initConnectionProperties();
                }
            }
        }
        return sOracleConnectionCreator;
    }
    
    
    /* (non-Javadoc)
     * @see com.dd.contact.sync.connection.ConnectionCreator#initConnectionProperties()
     */
    @Override
    void initConnectionProperties() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.dd.contact.sync.connection.ConnectionCreator#getDatabaseConnection()
     */
    @Override
    public Connection getDatabaseConnection() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.dd.contact.sync.connection.ConnectionCreator#closeDbConnection()
     */
    @Override
    public void closeDbConnection() {
        // TODO Auto-generated method stub

    }

}
