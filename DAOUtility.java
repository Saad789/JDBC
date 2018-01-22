package com.ts.us.utility;

import java.sql.*;

public class DAOUtility {

	public static void main(String[] args) {
		try {
			//Step1:Register with Driver
			DriverManager.registerDriver( new com.mysql.jdbc.Driver());
			System.out.println("**Successfully register with driver");
			
			//Step2:Get the Connection
			String url = "jdbc:mysql://127.0.0.1:3306/urbanspoon";
			String uname = "root";
			String pwd = "root";
			Connection con = DriverManager.getConnection(url, uname, pwd);
			System.out.println("we go the connection......");
			
			//Step3:Get the Statement object
			Statement stmt = con.createStatement();
			System.out.println("we got stmt object");	
			
			//step4:Execute the query
			String query = "insert into user values(2,'sunil','M','sunil@gmail.com','S345678',9988774455)";
			System.out.println("Query is:"+query);
			int no = stmt.executeUpdate(query);
			if(no>0){
				System.out.println(no+":Record is inserted please check it.");
			}else{
				System.out.println("Some Problemm....");
			}
			//step5:Close the connection
			con.close();
			
		   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
