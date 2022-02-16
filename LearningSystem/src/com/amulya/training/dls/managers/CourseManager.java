package com.amulya.training.dls.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

import com.amulya.training.dls.common.Course;

public class CourseManager {
	
	private Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/amulya_dls";
		String uname="root";
		String pass="Mammu@1412";
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(url, uname, pass);
		return con;

		
	}
	
	
	public void addCourse(int courseId,String courseName,String createdBy,String createdDt,String courseProvider,String courseDuration) throws Exception{
		//Add course to database	
		Connection con = this.getConnection();
		String q = String.format("insert into course values(%d,'%s','%s','%s','%s','%s')",courseId,courseName,createdBy,createdDt,courseProvider,courseDuration);
		Class.forName("com.mysql.cj.jdbc.Driver"); //load and register
		Statement st= con.createStatement();
	    int count =st.executeUpdate(q); 
		System.out.println(count +" rows affected");
		st.close();
		con.close();
	}
	

	public void updateCourse()	throws Exception{
		//update course in database
		Connection con = this.getConnection();
		String q1 ="update course set courseName='JAVA' where course_id=1"; 
		Class.forName("com.mysql.cj.jdbc.Driver"); //load and register
		Statement st= con.createStatement();
	    int count1 =st.executeUpdate(q1); 
		System.out.println(count1 +" rows affected");
		st.close();
		con.close();
	}
	
	
	public void deleteCourse(int courseId) throws Exception {
		//Delete course in database
		Connection con = this.getConnection();
		String q1 =String.format("delete from course where course_id=%d",courseId); 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Statement st= con.createStatement();
	    int count1 =st.executeUpdate(q1); 
		System.out.println(count1 +" rows affected");
		st.close();
		con.close();
    }
	
	
	public void addTopic(int topicId,String topicName,String topicDescription,int topicIndex,int moduleId) throws Exception {
		Connection con = this.getConnection();
		String q1 =String.format("insert into topic values(%d,'%s','%s',%d,%d)", topicId,topicName,topicDescription,topicIndex,moduleId); 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Statement st= con.createStatement();
	    int count1 =st.executeUpdate(q1); 
		System.out.println(count1 +" rows affected");
		st.close();
		con.close();
	}
	
	public void deleteTopic(int topicId) throws Exception {
		Connection con = this.getConnection();
		String q1 =String.format("insert into module values(%d)", topicId); 
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Statement st= con.createStatement();
	    int count1 =st.executeUpdate(q1); 
		System.out.println(count1 +" deleted the topic ");
		st.close();
		con.close();
	}
	
	
	public void addModule(int moduleId,String moduleName,int courseId) throws Exception {
		Connection con = this.getConnection();
		String q1 =String.format("insert into module (%d,'%s',%d)", moduleId,moduleName,courseId); 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Statement st= con.createStatement();
	    int count1 =st.executeUpdate(q1); 
		System.out.println(count1 +" rows affected");
		st.close();
		con.close();
	}
	
	
	public void deleteModule(int moduleId) throws Exception {
		Connection con = this.getConnection();
		String q1 =String.format("insert into module values(%d)", moduleId); 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Statement st= con.createStatement();
	    int count1 =st.executeUpdate(q1); 
		System.out.println(count1 +" rows affected");
		st.close();
		con.close();
	}	

}


