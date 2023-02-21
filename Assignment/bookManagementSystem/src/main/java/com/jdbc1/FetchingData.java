package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchingData{
	static Scanner scanner=new Scanner(System.in);
	public static void showBook() {
		try (Connection conn=DataBaseConnection.getDbConnection()){ 
		String sql="select * from book;";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("Book ID : "+rs.getInt(1));
			System.out.println("Book Name : "+rs.getString(2));
			System.out.println("Book Author : "+rs.getString(3));
			System.out.println("Book Price : "+rs.getInt(4));
			System.out.println("===============================");
			
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void showBookByID() {
		try (Connection conn=DataBaseConnection.getDbConnection()){ 
			String sql="select * from book where id=?;";
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter Book Id");
			int id=scanner.nextInt();
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("Book ID : "+rs.getInt(1));
				System.out.println("Book Name : "+rs.getString(2));
				System.out.println("Book Author : "+rs.getString(3));
				System.out.println("Book Price : "+rs.getInt(4));
				System.out.println("===============================");
				
			}else {
				System.out.println("Book not found");
			}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
}
