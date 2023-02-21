package com.jdbc1;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		try (Connection conn=DataBaseConnection.getDbConnection()){
			String sql="insert into book values(101,'java','R.nageswara Rao',739)";
			Statement st=conn.createStatement();
			int row =st.executeUpdate(sql);
			System.out.println(row +" Data inserted");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
