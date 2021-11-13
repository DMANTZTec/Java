package com.dmantz.vamshi.managers;

import com.dmantz.vamshi.common.Course;
import com.dmantz.vamshi.managers.TraineManager;


import java.sql.*;

public class CourseManager 
{
	public int courseManagerId;
	public String courseManagerName;
	private Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/dls";
		String uname="root";
		String pass="ganesh@321";
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection(url, uname, pass);
		return con;

		
	}

	public void addCourse(int courseId,String courseName,String courseProvider) throws Exception
	{
		Connection con=this.getConnection();

		 String query=String.format("insert into course values(%d,'%s','%s')",courseId,courseName,courseProvider) ;
		 Statement st=con.createStatement();
		 int rs =st.executeUpdate(query);
		 System.out.println(rs);
		 st.close();
		 con.close();
	}


		
	

	public void deleteCourse(int courseId) throws Exception
	{
		Connection con=this.getConnection();		 
		String query=String.format("delete from course where course_Id=%d",courseId);
		 Statement st=con.createStatement();
		 int count=st.executeUpdate(query);
		 System.out.println(count);
		 st.close();
		 con.close();

		
	}
    public void addModule(int moduleId,String moduleName,int moduleIndex,int courseId) throws Exception
    {
    	Connection con=this.getConnection();
		 String query=String.format("insert into module values(%d,'%s',%d,%d)",moduleId,moduleName,moduleIndex,courseId); 
		 Statement st=con.createStatement();
		 int count=st.executeUpdate(query);
		 System.out.println(count);
		 st.close();
		 con.close();
    	
    	
    }
    public void addTopic(int topicId,String topicName,String topicDescription,int topicIndex,int moduleId) throws Exception
    {
    	Connection con=this.getConnection();
    	String query=String.format("insert into topic values(%d,'%s','%s',%d,%d)",topicId,topicName, topicDescription,topicIndex,moduleId);
		 Statement st=con.createStatement();
		 int count=st.executeUpdate(query);
		 System.out.println(count);
		 st.close();
		 con.close();
    }
    public void deleteTopic(int topicId) throws Exception
    {
    	Connection con=this.getConnection();
		 String query=String.format("delete from topic where topic_Id=%d",topicId);
		 Statement st=con.createStatement();
		 int count=st.executeUpdate(query);
		 System.out.println(count);
		 st.close();
		 con.close();
    	
    }
    public void deleteModule(int module_id) throws Exception
    {
    	Connection con=this.getConnection();
    	String query=String.format("delete from module where module_Id=%d",module_id);
		 Statement st=con.createStatement();
		 int count=st.executeUpdate(query);
		 System.out.println(count);
		 st.close();
		 con.close();
    	
    }


}



