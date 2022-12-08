package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration_form {
	
		
	public static void main(String[] args) throws SQLException  {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter user Name");
			String userName=sc.next();
			
			System.out.println("Enter EmailId ");
			String Email=sc.next();
			
			System.out.println("Enter your mobile number ");
			String mobNumber=sc.next();
			 
			System.out.println("Enter your Password");
			String Password=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Rutuja");
		
		PreparedStatement pps=c.prepareStatement("insert into registration(user_name, EmailId , mobile_num , pasword)values(?,?,?,?)");
		pps.setString(1, userName);
		pps.setString(2, Email);
		pps.setString(3, mobNumber);
		pps.setString(4, Password);
		pps.execute();
		System.out.println("registration done");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	
}
}