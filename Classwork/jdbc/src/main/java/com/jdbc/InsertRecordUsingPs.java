package com.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecordUsingPs {

	public static void main(String[] args) {
		try(Connection conn=DataBaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{   
			String sql="insert into employee1 values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("enter id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter name: ");
			String name=sc.nextLine();
			System.out.println("enter email: ");
			String email=sc.nextLine();
			System.out.println("Enter salary: ");
			int salary=sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, salary);
			int r=ps.executeUpdate();
			System.out.println(r+" record update successfully");
			
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
