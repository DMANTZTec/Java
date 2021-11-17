package com.dmantz.swapna.dls.training.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

//import java.util.ArrayList;
//import java.util.List;

import com.dmantz.swapna.dls.training.common.Course;

public class CourseManager {
	
	private Connection getConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");// loading and registering database driver to connect our java application with a database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dmantzlearningsystem","root","swapna2021");//creating the connection between java program and mysql database
		return con;
	}
	
	

	public void addCourse(int courseId, String courseName, String createdDate,String createdBy,String recommendedDuration,String courseProvider) throws Exception {
		
		    
		    Connection con=this.getConnection();
			Statement st=con.createStatement();//creating statement object to execute sql statements
			String query=String.format("insert into course values(%d,'%s','%s','%s','%s','%s')",courseId,courseName,createdDate, createdBy,recommendedDuration,courseProvider);
			int count=st.executeUpdate(query);//Executing sql query using statement object
			System.out.println(count +"row/s affected");
			st.close();
			con.close();  
			}
	public void manageCourse()
	{
		
	}
	public void viewCourseDetails() throws Exception
	{ 
		Connection con=this.getConnection();
		String query=null;
		Statement st=con.createStatement();
		query=String.format("select * from course");
		System.out.println("courseId"+" \t "+"courseName"+" \t "+"createdBy"+" \t "+"createdDate"+"  \t  "+"recommendedDuration"+"  \t "+"courseProvider");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		ResultSet rs=st.executeQuery(query);
	    String userdata="";
	    	while(rs.next())
	    	{
	    		userdata=rs.getInt(1)+"\t\t"+rs.getString(2)+"  \t"+rs.getString(3)+"\t "+rs.getString(4)+"  \t  "+rs.getString(5)+"\t\t"+rs.getString(6);
	    		System.out.println(userdata);
	    	}
		
		st.close();
		con.close(); 
	}
	public String addModule(int moduleId,String moduleName,int moduleIndex ,int courseId) 
	{
		try
		{
	    Connection con=this.getConnection();
		String query=null;
		Statement st=con.createStatement();
		query=String.format("insert into module values('%d','%s',%d,%d)",moduleId,moduleName,moduleIndex,courseId);
		int count=st.executeUpdate(query);
		System.out.println(count +"row/s affected");
		st.close();
		con.close(); 
		}catch(Exception e) {System.out.println(e);}
		
		return  "Module added successfully";
		
		
	}
	public void addTopic(int topicId,String topicName,String topicDescription,int topicIndex ,int moduleId ) 
	{
		try {
		Connection con=this.getConnection();
		String query=null;
		Statement st=con.createStatement();
		query=String.format("insert into topic values('%d','%s','%s',%d,%d)",topicId,topicName,topicDescription,topicIndex,moduleId);
		int count=st.executeUpdate(query);
		System.out.println(count +"row/s affected");
		System.out.println("topic added successfully"); 
		st.close();
		con.close();
		}catch(Exception e) { System.out.println(e);}
		
	
		
	}
	public void deleteModule(int moduleId) throws Exception{
	
	String query;	
	Connection con=this.getConnection();
	Statement st=con.createStatement();
	query=String.format("delete from module where moduleid=%d",moduleId);
	int count=st.executeUpdate(query);
	System.out.println(count +"row/s affected");
	st.close();
	con.close(); 
		
	}
	public void deleteCourse(int courseId) throws Exception
	{
		   
		    String query;
		    Connection con=this.getConnection();
			Statement st=con.createStatement();
			query= String.format("delete from course where courseid=%d",courseId);
			int count=st.executeUpdate(query);
			System.out.println(count +"row/s affected");
			st.close();
			con.close();  
				
	}
	public void updateCourseProperties(Course courseId) throws Exception
	{
		
		
		String query;
		Connection con=this.getConnection();
		Statement st=con.createStatement();
		query= String.format("update course set course_name='%s' where course_name='%s' ");
		int count=st.executeUpdate(query);
		System.out.println(count +"row/s affected");
		st.close(); 
		con.close();  

	}
	public String deleteTopic(int topicid) 
	{ 
		
		
		try
		{
		String query=null;
		Connection con=this.getConnection();
		Statement st=con.createStatement();
		query=String.format("delete from topic where topicid=%d",topicid);
		int count=st.executeUpdate(query);
		System.out.println(count +"row/s affected");
		st.close();
		con.close(); 
		}catch(Exception e) {System.out.println(e);}
		
		return "topic deleted successfully";
	}
	public String updateTopic() throws Exception 
	{   
		
		try {
		String query;
		Connection con=this.getConnection();
		Statement st=con.createStatement();
		query= String.format("update course set course_name='%s' where course_name='%s' ");
		int count=st.executeUpdate(query);
		System.out.println(count +"row/s affected");
		st.close(); 
		con.close();
		}catch(Exception e) { System.out.println(e);}
		
		return "topic updated successfully";
	}
		


}

