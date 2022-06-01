package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
   private static Connection connection;
   
   static {
	   try {
		   Class.forName("org.h2.Driver");
		   connection=DriverManager.getConnection("jdbc:h2:e:\\db","sa","");
	   }
	   catch(ClassNotFoundException | SQLException e) {
		   e.printStackTrace();
		   
		   
	   }
   }
   
   public static Connection getConnection() {
	   return connection;
   }
}
