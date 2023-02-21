package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEx {
		public static void main(String[] args) {
			try(Connection conn=DataBaseConnection.getDbConnection();
					Scanner sc =new Scanner(System.in)) {
				System.out.println("enter name : ");
				String name=sc.nextLine();
				System.out.println("Enter Email : ");
				String email=sc.nextLine();
				System.out.println("Enter salary");
				int salary=sc.nextInt();
				String sql="update employee1 set name='"+name+"',email='"+email+"',salary='"+salary+"' where id=?";
				PreparedStatement  ps =conn.prepareStatement(sql);
				System.out.println("Enter id ");
				int id=sc.nextInt();
				ps.setInt(1, id);
				int row=ps.executeUpdate();
			    if (row==0) {
					System.out.println("No id found");
				}else {
					System.out.println(row+" Update complete");
				}
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
}
