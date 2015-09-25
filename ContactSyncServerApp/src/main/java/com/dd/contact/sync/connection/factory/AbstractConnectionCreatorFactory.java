/**
Copyright homeblackbox project to represent
All right reserved.
*/
/**
 * 
 */
package com.dd.contact.sync.connection.factory;

import com.dd.contact.sync.connection.ConnectionCreator;
import com.dd.contact.sync.connection.ConnectionType;

/**
 * @author DIPANJAN
 *
 */
public abstract class AbstractConnectionCreatorFactory {
    public abstract ConnectionCreator getConnectionCreator(ConnectionType type)
                                        throws NullPointerException, ClassNotFoundException;
}
