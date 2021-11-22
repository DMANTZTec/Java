package com.demo.jdbc;
import java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/dls";
		String un="root";
		String pw="Mammu@1412";
		String query ="select courseName  from course where courseId=3 "; 
		Class.forName("com.mysql.cj.jdbc.Driver"); //load and register
		Connection con = DriverManager.getConnection(url, un, pw); //create connection
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery(query); 
		rs.next();
		String n = rs.getString("courseName");
		
		System.out.println(n);
		
		String q ="insert into course values(9,'kafka1','f')"; 
		/*Class.forName("com.mysql.cj.jdbc.Driver"); //load and register
		Connection con1 = DriverManager.getConnection(url, un, pw); //create connection
		Statement st1= con1.createStatement();*/
	    int count =st.executeUpdate(q); 
		System.out.println(count +" rows affected");
		
		
		String q1 ="delete from course where courseId=8";
		 int count1 =st.executeUpdate(q1); 
			System.out.println(count1 +" rows affected");
		
		
		
		st.close();
		con.close(); 
		
		
		
		

	}
 
}
