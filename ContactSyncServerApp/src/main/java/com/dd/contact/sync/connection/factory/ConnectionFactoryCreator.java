/**
Copyright homeblackbox project to represent
All right reserved.
*/

package com.dd.contact.sync.connection.factory;

/**
 * @author DIPANJAN
 *
 * @version $Revision: 1.0 $
 */
public final class ConnectionFactoryCreator {
    /**
     * Method createDbConnectionCreatorFactory.
     * @return AbstractConnectionCreatorFactory
     */
    public static final AbstractConnectionCreatorFactory createDbConnectionCreatorFactory() {
        return new DbConnectionCreatorFactory();
    }
}
