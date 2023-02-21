package com.jdbc1;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try (Connection conn=DataBaseConnection.getDbConnection()){
			String sql="create table book(id int primary key ,bookName varchar(50) "
					+ ",author varchar(25) ,price int);";
			Statement st =conn.createStatement();
			st.executeUpdate(sql);
			System.out.println("Table created successfully");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
