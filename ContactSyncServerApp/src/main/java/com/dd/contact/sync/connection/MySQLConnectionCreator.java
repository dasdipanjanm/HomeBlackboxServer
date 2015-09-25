/**
Copyright homeblackbox project to represent
All right reserved.
*/
package com.dd.contact.sync.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.dd.contact.sync.db.constant.IMySqlDbInformation;

/**
 * @author DIPANJAN
 *
 * @version $Revision: 1.0 $
 */
public class MySQLConnectionCreator extends ConnectionCreator implements IMySqlDbInformation {
    private static MySQLConnectionCreator sMySqlConnectionCreator;
    private String mDatabaseUrl;
    private Connection mConnection;
    private MySQLConnectionCreator() {
        
    }
    public static MySQLConnectionCreator getInstance() throws ClassNotFoundException {
        if (sMySqlConnectionCreator == null) {
            synchronized (MSSqlConnectionCreator.class) {
                if (sMySqlConnectionCreator == null) {
                    sMySqlConnectionCreator = new MySQLConnectionCreator();
                    sMySqlConnectionCreator.initConnectionProperties();
                }
            }
        }
        return sMySqlConnectionCreator;
    }
    @Override
    void initConnectionProperties() throws ClassNotFoundException {
        Class.forName(CONTACT_SYNC_DB_JDBC_DRIVER);
        mDatabaseUrl = databaseUrlBuilder();
    }

    @Override
    public Connection getDatabaseConnection() throws SQLException {
        mConnection = DriverManager.getConnection(mDatabaseUrl, CONTACT_SYNC_MYSQL_DATABASE_USERNAME, 
                                                                                CONTACT_SYNC_MYSQL_DATABASE_PASSWORD);
        return mConnection;
    }

    @Override
    public void closeDbConnection() throws SQLException {
       if (mConnection == null) return;
       mConnection.close();
    }
    public String databaseUrlBuilder() {
       StringBuilder builder = new StringBuilder();
       builder.append(MYSQL_DATABASE_URL_PREFIX);
       builder.append(CONTACT_SYNC_MYSQL_DB_SERVER_IP);
       builder.append(COLON);
       builder.append(CONTACT_SYNC_MYSQL_DB_SERVER_PORT);
       builder.append(SEPARATOR);
       builder.append(CONTACT_SYNC_MYSQL_DATABASE_NAME);
       return builder.toString();
    }
   
}
