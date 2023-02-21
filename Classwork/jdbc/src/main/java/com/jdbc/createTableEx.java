package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class createTableEx {
	public static void main(String[] args) {
		try (Connection conn=DataBaseConnection.getDbConnection()){
			//create statement
			Statement st=conn.createStatement(); 
			String sql="create table employee1(id int primary key,"
					+ "name varchar(25),email varchar(50),salary int)";
			//execute query
			st.executeUpdate(sql);
			System.out.println("table created successfully");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
