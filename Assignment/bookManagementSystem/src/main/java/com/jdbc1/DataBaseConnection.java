package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
		static Connection con=null;
		public static Connection getDbConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","system");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return con;
		}
}
