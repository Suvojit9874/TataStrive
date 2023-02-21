package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEx {
		public static void updateTable(){
			
			try(Connection conn=DataBaseConnection.getDbConnection()){
				Scanner sc =new Scanner(System.in);
				System.out.println("enter name : ");
				String name=sc.nextLine();
				System.out.println("Enter Author Name : ");
				String author=sc.nextLine();
				System.out.println("Enter Price");
				int price=sc.nextInt();
				String sql="update book set bookName='"+name+"',author='"+author+"',price='"+price+"' where id=?";
				PreparedStatement  ps =conn.prepareStatement(sql);
				System.out.println("Enter id ");
				int id=sc.nextInt();
				ps.setInt(1, id);
				int row=ps.executeUpdate();
				if (row==0) {
					System.out.println("ID not found");
				}else {
				System.out.println(row+" Update complete");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
}

