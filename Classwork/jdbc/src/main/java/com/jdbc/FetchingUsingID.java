package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class FetchingUsingID {
	public static void main(String[] args) {
		try(Connection conn=DataBaseConnection.getDbConnection();
				Scanner sc=new Scanner(System.in))
		{
			String sql="select * from employee1 where id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter the id: ");
			int id=sc.nextInt();
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Employee id: "+rs.getInt(1));
				System.out.println("Employee name: "+rs.getString("name"));
				System.out.println("Employee email: "+rs.getString("email"));
				System.out.println("employee salary: "+rs.getInt(4));
				System.out.println("===================================");
			}
			else
				System.out.println("id not found");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
}}
