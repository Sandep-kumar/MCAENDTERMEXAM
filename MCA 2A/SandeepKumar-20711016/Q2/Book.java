package com.Sandeep.book;

 import java.sql.*;
 import java.util.*;

public class Book {

	 static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	   static final String user = "mca";
	   static final String pass = "mca";

	   public static void main(String[] args) {
	    
	      try
	       {	
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  Connection con= DriverManager.getConnection(url,user,pass);
	    	  
	    	  Scanner sc = new Scanner(System.in);

	    	  System.out.print("bookname: ");
	    	  String Bn = sc.nextLine();

	    	  System.out.print("author name: ");
	    	  String An = sc.nextLine();

	    	  System.out.print("number of pages: ");
	    	  int Pn = sc.nextInt();
	    	  
	    	  System.out.print("price : ");
	    	  int Pr = sc.nextInt();
	    	  
	    	  
	    	  String sql = "insert into books values (?, ?, ?,?)";

	    	  PreparedStatement myStmt = con.prepareStatement(sql);
	    		
	    		myStmt.setString(1, Bn);
	    		myStmt.setString(2, An);
	    		myStmt.setInt(3, Pn);
	    		myStmt.setInt(4, Pr);
	    		myStmt.executeUpdate();
	    	  sc.close();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	      catch (ClassNotFoundException e) {
		         e.printStackTrace();
		      } 
	   }
		

	}


