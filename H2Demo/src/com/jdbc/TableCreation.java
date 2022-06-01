package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreation {
   public static void main(String[] args) {
	   Connection connection = ConnectionProvider.getConnection();
	   try {
		  Statement s= connection.createStatement();
		  s.executeUpdate("create table person(sno int primary key,name varchar(30),city varchar(30))");
		  System.out.println("Table Created"); 
	   }
	   catch(SQLException e) {
		   e.printStackTrace();
	   }
	   
   }
}
