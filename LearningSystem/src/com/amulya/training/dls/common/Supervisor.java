package com.amulya.training.dls.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Supervisor {
	
	private Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/amulya_dls";
		String uname="root";
		String pass="Mammu@1412";
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(url, uname, pass);
		return con;

		
	}
	
	public void AssignCourses(int tc_id,int traineeId,int courseId,String traineeName) throws Exception {
		Connection con = this.getConnection();
		String query = String.format("insert into  trainee_course values(%d,%d,%d,'%s')",tc_id,traineeId,courseId,traineeName); 
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Statement st= con.createStatement();
		int rs=st.executeUpdate(query); 
		System.out.println(rs);
	
		st.close();
		con.close();
	}
	
	public void viewCourseProgress(int courseId) throws Exception {
		Connection con = this.getConnection();
		String query=String.format("select from worklog where course_id=%d",courseId);
		Class.forName("com.mysql.cj.jdbc.Driver");//loading and register the driver using forName method
		Statement st=con.createStatement(); //creating statement by using connection interface
		ResultSet rs=st.executeQuery(query);//executes the query and stores in result set object
		while(rs.next()) //to fetch the next record
		{
			String course=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5);		
			System.out.println(course); 
		}		
		st.close(); //closing statement
		con.close();//closing connection
	}
		
	
	
	



	

	
	

}
