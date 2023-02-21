package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		try (Connection conn=DataBaseConnection.getDbConnection()){
			//create statement
			Statement st=conn.createStatement(); 
			String query="insert into employee1 values(102,'argha',"
					+ "'arghasen84@gmail.com',150000)";
			//execute query
			int row=st.executeUpdate(query);
			System.out.println(row+" record added successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
