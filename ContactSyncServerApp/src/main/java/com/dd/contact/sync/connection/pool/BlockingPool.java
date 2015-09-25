/**
Copyright homeblackbox project to represent
All right reserved.
*/
package com.dd.contact.sync.connection.pool;

import java.sql.Connection;
import java.util.concurrent.TimeUnit;

public interface BlockingPool extends Pool {
    public Connection  get();  
    public Connection get(long time, TimeUnit unit) throws InterruptedException; 
}
