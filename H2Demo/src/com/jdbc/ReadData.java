package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {
	  public static void main(String[] args) {
		   Connection connection = ConnectionProvider.getConnection();
		   try {
			  Statement s= connection.createStatement();
			  ResultSet rs=s.executeQuery("select * from person");
			  while(rs.next()) {
				  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
			  }
			  System.out.println("Table Created"); 
		   }
		   catch(SQLException e) {
			   e.printStackTrace();
		   }
		   
	   }
}
