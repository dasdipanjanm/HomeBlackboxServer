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
public abstract class AbstractPool implements Pool {
    public void release(Connection con) {
        if (isValid(con)) {
            returnToPool(con);
        } else {
            handleInvalidReturn(con);
        }
    }
    public abstract void handleInvalidReturn(Connection t);  
    public abstract void returnToPool(Connection t);  
    public abstract boolean isValid(Connection t);
}
