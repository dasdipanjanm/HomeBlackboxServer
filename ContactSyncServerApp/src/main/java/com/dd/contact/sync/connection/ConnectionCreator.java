/**
Copyright homeblackbox project to represent
All right reserved.
*/
package com.dd.contact.sync.connection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author DIPANJAN
 *
 * @version $Revision: 1.0 $
 */
public abstract class ConnectionCreator {
    abstract void initConnectionProperties() throws ClassNotFoundException;
    /**
     * Method getDatabaseConnection.
     * @return Connection
     * @throws SQLException 
     */
    public abstract Connection getDatabaseConnection() throws SQLException;
	/**
     * Method getDatabaseConnection.
     * @return Connection
     * @throws SQLException 
     */
    public abstract void closeDbConnection() throws SQLException;
}
