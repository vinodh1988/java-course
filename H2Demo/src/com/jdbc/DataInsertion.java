package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInsertion {
	  public static void main(String[] args) {
		   Connection connection = ConnectionProvider.getConnection();
		   try {
			  Statement s= connection.createStatement();
			  s.executeUpdate("insert into person values(2,'Rahul','Mumbai')");
			  System.out.println("record Created"); 
		   }
		   catch(SQLException e) {
			   e.printStackTrace();
		   }
		   
	   }
}
