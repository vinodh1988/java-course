package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedDemo {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=ConnectionProvider.getConnection();
		while(true) {
			System.out.println("Enter sno");
			int sno =Integer.parseInt(sc.next());
			if(sno<=0)
				break;
			System.out.println("Enter Name ");
			String name =sc.next();
			System.out.println("Enter city");
			String city =sc.next();
			try {
				PreparedStatement ps=con.prepareStatement("insert into person values(?,?,?)");
			    ps.setInt(1, sno);
			    ps.setString(2, name);
			    ps.setString(3, city);
			    ps.executeUpdate();
			    System.out.println("Row inserted");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exited loop");
	}
}
