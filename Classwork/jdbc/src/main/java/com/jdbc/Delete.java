package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) {
		/* try (Connection conn=DataBaseConnection.getDbConnection()){
			String sql="delete from employee1 where id=103";
			Statement st=conn.createStatement();
			st.executeUpdate(sql);
			System.out.println("Data deleted successfully");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}																	*/
		try(Connection conn=DataBaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in)) {
			String query="delete from employee1 where id=?";
			PreparedStatement ps=conn.prepareStatement(query);
				System.out.println("Enter Id which one you want to delete ");
				int id =sc.nextInt();
				ps.setInt(1, id);
				int row =ps.executeUpdate();
				if(row==0) {
					System.out.println("Id not found");
				}else {
				System.out.println("Data deleted successfully");
				}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}												
		
	}
}
