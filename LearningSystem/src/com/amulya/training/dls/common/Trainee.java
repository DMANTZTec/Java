package com.amulya.training.dls.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Trainee {
	public int traineeId;
	private String traineeName;
	private String traineeEmail;
	
	private Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/amulya_dls";
		String uname="root";
		String pass="Mammu@1412";
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(url, uname, pass);
		return con;

		
	}
	

	public void viewAllCourses() throws Exception {
		Connection con = this.getConnection();
		String query ="select*from course"; 
		Class.forName("com.mysql.cj.jdbc.Driver"); //load and register
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery(query); 
		while(rs.next())
		{
			String course=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5);		
			System.out.println(course); 
		}	
		
	
		st.close();
		con.close();
	}
	
	
	public void viewAssignedCourses(int traineeId) throws Exception {
		Connection con = this.getConnection();
		String query =String.format("select*from trainee_course where trainee_id=%d",traineeId); 
		Class.forName("com.mysql.cj.jdbc.Driver"); //load and register
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery(query); 
		while(rs.next())
		{
			String course=rs.getInt(1)+":"+rs.getInt(2)+":"+rs.getInt(3)+":"+rs.getString(4);		
			System.out.println(course); 
		}	
		
	
		st.close();
		con.close();
	}
	
	
	public void reportDailyProgress(int traineeId,String traineeName,int moduleId,int topicId,String startDate,String endDate,String status) throws Exception
	{
		 Connection con = this.getConnection();
		 String query=String.format("insert into worklog values(%d,'%s',%d,%d,'%s','%s','%s')" ,traineeId,traineeName,moduleId,topicId,startDate,endDate,status);
		 Statement st=con.createStatement();
		 int count=st.executeUpdate(query);
		 System.out.println(count);
		 st.close();
		 con.close();

		
	}
	
	
	/*public void viewCourseProgress(int courseId) throws Exception
	{
		Connection con = this.getConnection();
        Statement st=con.createStatement(); 
        String query=String.format("select*from worklog where =%d",courseId);
		ResultSet rs=st.executeQuery(query);	
		while(rs.next()) 
		{
			String course=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"+rs.getString(8)+":"+rs.getNString(9);		
			System.out.println(course); 
		}		
		st.close();
		con.close();
	}*/
	
	
	public void viewOtherTraineeProgress(int traineeId) throws Exception
	{
		Connection con = this.getConnection();
	    String query=String.format("select*from worklog where trainee_id=%d",traineeId );
        Statement st=con.createStatement(); 
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) 	
		{
			String course=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7);	
			System.out.println(course); 
		}		
		st.close(); 
		con.close();	}


	public String getTraineeEmail() {
		return traineeEmail;
	}


	public void setTraineeEmail(String traineeEmail) {
		this.traineeEmail = traineeEmail;
	}


	public String getTraineeName() {
		return traineeName;
	}


	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
		
	
}
