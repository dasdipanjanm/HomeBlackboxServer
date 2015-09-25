/**
Copyright homeblackbox project to represent
All right reserved.
*/

package com.dd.contact.sync.connection.pool;

import java.sql.Connection;
import java.sql.SQLException;

import com.dd.contact.sync.connection.pool.Pool.Validator;

/**
 * @author DIPANJAN
 *
 */
public class JDBCConnectionValidator implements Validator {
    private static JDBCConnectionValidator sValidator;
    
    public static Validator getInstance() {
        if (sValidator == null) {
            return new JDBCConnectionValidator();
        }
        return sValidator;
    }

    public boolean isValid(Connection connection) {
        try {
            return connection != null ? !connection.isClosed() : false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void invalidate(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
