/**
Copyright homeblackbox project to represent
All right reserved.
*/
/**
 * 
 */
package com.dd.contact.sync.connection.pool;

import java.sql.Connection;

/**
 * @author DIPANJAN
 *
 */
public interface Pool {
    public Connection get();
    public void release(Connection t);  
    void shutdown();  

    public static interface Validator {
        public boolean isValid(Connection t);
        public void invalidate(Connection t);
    } 
}
