/**
Copyright homeblackbox project to represent
All right reserved.
*/
package com.dd.contact.sync.db.constant;

/**
 * @author DIPANJAN
 *
 */
public interface IMySqlDbInformation {
    public static final String COLON = ":";
    public static final String SEPARATOR = "/";
    public static final String MYSQL_DATABASE_URL_PREFIX = "jdbc:mysql://";
    public static final String CONTACT_SYNC_DB_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String CONTACT_SYNC_MYSQL_DB_SERVER_IP = "182.50.133.85";
    public static final String CONTACT_SYNC_MYSQL_DB_SERVER_PORT = "3306";
    public static final String CONTACT_SYNC_MYSQL_DATABASE_NAME = "mobile_contact_test_db";
    public static final String CONTACT_SYNC_MYSQL_DATABASE_USERNAME = "dipanjan3d";
    public static final String CONTACT_SYNC_MYSQL_DATABASE_PASSWORD = "W%gmh136";
    public String databaseUrlBuilder();
}
