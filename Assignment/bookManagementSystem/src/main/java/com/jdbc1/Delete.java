package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
	
	public static void removeBook() {
		Scanner scanner=new Scanner(System.in);
		try (Connection conn=DataBaseConnection.getDbConnection()){
			String sql="delete from book where id=?;";
			PreparedStatement ps=conn.prepareStatement(sql);
			System.out.println("Enter Book ID");
			int id =scanner.nextInt();
			ps.setInt(1, id);
			int r=ps.executeUpdate();
			System.out.println(r+" Book Removed Successfully");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
