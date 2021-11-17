package com.dmantz.swapna.dls.training.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Worklogentry {
	
	private Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dmantzlearningsystem","root","swapna2021");
		return con;
	}
	
	
	public void reportDailyProgress(String traineename,int taskId,String coursename,String modulename,String topicname, int topicid,String status,String startdate,String enddate,String issue ) throws Exception
	{  
		    Connection con=this.getConnection();
		    String query=null;
			Statement st=con.createStatement();
			query=String.format("insert into worklog values ('%s',%d,'%s','%s','%s',%d,'%s','%s','%s','%s')",traineename,taskId,coursename,modulename,topicname,topicid,status,startdate,enddate,issue);
			int count=st.executeUpdate(query);
			System.out.println(count +"row/s affected");
			st.close();
			con.close();  

		
	}
	
	
	public void viewReportDailyProgress() throws Exception
	{
		    Connection con=this.getConnection();
		    String query=null;
			Statement st=con.createStatement();
			query=String.format("select * from worklog ");
			ResultSet rs=st.executeQuery(query);
		    String userdata="";
		    	while(rs.next())
		    	{
		    		userdata=rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+ rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10);
		    		System.out.println(userdata);
		    	}
			st.close();
			con.close();  

	}
	public void viewAllAvailableCourses() throws Exception {
		
		
		String query=null;  
		Connection con=this.getConnection();
		Statement st=con.createStatement();
		query=String.format("select * from course ");
		ResultSet rs=st.executeQuery(query);
	    String userdata="";
	    	while(rs.next())
	    	{
	    		userdata=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+rs.getString(4)+" "+rs.getString(5);
	    		System.out.println(userdata);
	    	}
		st.close();
		con.close();  

		
	}
	public void viewMyAssignedCourses(int course_trainee_id) throws Exception {
		      
		   
		    Connection con=this.getConnection();
		    String query=null;
			Statement st=con.createStatement();
			query=String.format("select * from course_trainee where course_trainee_id=%d",course_trainee_id);
			ResultSet rs=st.executeQuery(query);
		    String userdata="";
		    	while(rs.next())
		    	{
		    		userdata=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3);
		    		System.out.println(userdata);
		    	}
			st.close();
			con.close();  
		
		
	}

}
