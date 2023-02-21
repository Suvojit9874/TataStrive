package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecordUsingPS {
	static Scanner sc=new Scanner(System.in);
	public static void InsertBook() {
		try(Connection conn=DataBaseConnection.getDbConnection()) {
			String sql="insert into book values(?,?,?,?);";
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter book id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter book name");
			String bookName=sc.nextLine();
			System.out.println("Enter Author name");
			String author=sc.nextLine();
			System.out.println("Enter Book Price");
			int price = sc.nextInt();
			ps.setInt(1, id);
			ps.setString(2, bookName);
			ps.setString(3, author);
			ps.setInt(4,price);
			int r=ps.executeUpdate();
			System.out.println(r+" Record Added Successfully");
			} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
