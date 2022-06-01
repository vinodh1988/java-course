package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {
	  public static void main(String[] args) {
		   Connection connection = ConnectionProvider.getConnection();
		   try {
			  Statement s= connection.createStatement();
			  ResultSet rs=s.executeQuery("select * from person");
			  ResultSetMetaData rm=rs.getMetaData();
			  System.out.println(rm.getColumnName(1)+" "+rm.getColumnName(2)+" "+rm.getColumnName(3));
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
