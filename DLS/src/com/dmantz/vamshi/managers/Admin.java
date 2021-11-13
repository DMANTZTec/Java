package com.dmantz.vamshi.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Admin {
	public int adminId;
	public String adminName;
	public String adminMail;
	private Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/dls";
		String uname="root";
		String pass="ganesh@321";
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection(url, uname, pass);
		return con;

		
	}
	
	public void assignCoursesTrainees(int traine_courseid,int traineeId,int courseId,String courseName) throws Exception
	{
		Connection con=this.getConnection();
		Statement st=con.createStatement();
		 String query=String.format("insert into traine_course values(%d,%d,%d,'%s')",traine_courseid,traineeId,courseId,courseName) ;
		 int rs =st.executeUpdate(query);
		 System.out.println(rs);
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

}
