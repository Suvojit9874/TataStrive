package com.jdbc1;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection conn = DataBaseConnection.getDbConnection();
        System.out.println(conn);
    }
}
