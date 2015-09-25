/**
Copyright homeblackbox project to represent
All right reserved.
*/
package com.dd.contact.sync.connection.factory;

import com.dd.contact.sync.connection.ConnectionCreator;
import com.dd.contact.sync.connection.ConnectionType;
import com.dd.contact.sync.connection.MSSqlConnectionCreator;
import com.dd.contact.sync.connection.MySQLConnectionCreator;
import com.dd.contact.sync.connection.OracleConnectionCreator;
import com.dd.contact.sync.db.constant.MessageConstant;

/**
 * @author DIPANJAN
 *
 * @version $Revision: 1.0 $
 */
public class DbConnectionCreatorFactory extends AbstractConnectionCreatorFactory {

    /**
     * Method getConnectionCreator.
     * @param type ConnectionType
     * @return ConnectionCreator
     * @throws NullPointerException
     * @throws ClassNotFoundException 
     */
    @Override
    public ConnectionCreator getConnectionCreator(ConnectionType type) throws NullPointerException,
                                                                                ClassNotFoundException{
        if (type == null) {
            throw new NullPointerException(MessageConstant.getNullExceptionMessage());
        }
        switch (type) {
        case MYSQL:
            return MySQLConnectionCreator.getInstance() ;
        case MSSQL:
            return MSSqlConnectionCreator.getInstance();
        case ORACLE:
            return OracleConnectionCreator.getInstance();
        default:
            return null;
        }
    }
}
