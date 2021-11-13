package com.dmantz.vamshi.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Trainee {
	public int traineId;
	public String traineName;
	public String traineMail;
	private Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/dls";
		String uname="root";
		String pass="ganesh@321";
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection(url, uname, pass);
		return con;

		
	}

	public void viewAssignedCourses(int traineeId) throws Exception
	{
		Connection con=this.getConnection();
		String query=String.format("select*from traine_course where trainee_Id=%d",traineeId);
		Statement st=con.createStatement(); 
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) 
		{
		  String course=rs.getInt(1)+":"+rs.getInt(2)+":"+rs.getInt(3)+":"+rs.getString(4);
		System.out.println(course); 	
		}		
		st.close(); 
		con.close();
	}
		
	
	
	public void viewAllCourses() throws Exception
	{
		Connection con=this.getConnection();
    	String query="select*from course";
		Statement st=con.createStatement(); 
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) 
		{
		  String course=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3);
		System.out.println(course);		}		
		st.close(); 
		con.close();	}
	public void reportDailyProgress(int worklogId,String progress,int traineeId,int courseId,int moduleId,int topicId,String topicname,String status) throws Exception
	{

		Connection con=this.getConnection();

		 String query=String.format("insert into worklog values(%d,'%s',%d,%d,%d,%d,'%s','%s')",worklogId,progress, traineeId,courseId,moduleId,topicId,topicname,status);
			
		 Statement st=con.createStatement();
		 int count=st.executeUpdate(query);
		 System.out.println(count);
		 st.close();
		 con.close();

		
	}
	public void viewCourseProgress(int courseId) throws Exception
	{
		Connection con=this.getConnection();
        Statement st=con.createStatement(); 
        String query=String.format("select*from worklog where course_Id=%d",courseId);
		ResultSet rs=st.executeQuery(query);	
		while(rs.next()) 
		{
			String course=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getInt(5)+":"+rs.getInt(6)+":"+rs.getString(7)+":"+rs.getString(8);		
			System.out.println(course); 
		}		
		st.close();
		con.close();
	}
	public void viewOthersProgress(int traineeId) throws Exception
	{
		Connection con=this.getConnection();
	    String query=String.format("select*from worklog where trainee_Id=%d",traineeId );
        Statement st=con.createStatement(); 
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) 	
		{
			String course=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getInt(5)+":"+rs.getInt(6)+":"+rs.getString(7)+":"+rs.getString(8);		
			System.out.println(course); 
		}		
		st.close(); 
		con.close();	}
	

}
