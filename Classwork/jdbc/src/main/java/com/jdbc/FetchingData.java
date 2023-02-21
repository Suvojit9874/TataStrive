package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchingData {
	public static void main(String[] args) {
		try (Connection conn=DataBaseConnection.getDbConnection()){
			String sql="select * from employee1";
			PreparedStatement  ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
//				System.out.println("Employee Id :" +rs.getInt(1));
				System.out.println("Employee Id :" +rs.getInt("id"));
				System.out.println("Employee name :" +rs.getString("name"));
				System.out.println("Employee email :" +rs.getString("email"));
				System.out.println("Employee Salary :" +rs.getInt("salary"));
				System.out.println("===================");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
