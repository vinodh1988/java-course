package com.jdbc;

import java.sql.Connection;

public class MainP {
   public static void main(String n[]) {
	   Connection connection = ConnectionProvider.getConnection();
	   System.out.println("Connection is"+connection);
   }
}
