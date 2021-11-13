package com.dmantz.vamshi.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.dmantz.vamshi.common.Course;
import com.dmantz.vamshi.common.Trainee;

public class TraineManager {
	public int traineManagerId;
	public String traineManagerName;
	public String traineManagerMail;
	private Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/dls";
		String uname="root";
		String pass="ganesh@321";
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection(url, uname, pass);
		return con;

		
	}
		
	public void addTrainees(int trainee_Id,String traineeName,String traineeMail)  throws Exception
	{
		Connection con=this.getConnection();


		Statement st=con.createStatement();
		 String query=String.format("insert into trainee values(%d,'%s','%s')",trainee_Id,traineeName,traineeMail) ;
		 int rs =st.executeUpdate(query);
		 System.out.println(rs);
		 st.close();
		 con.close();

	}
	public void updateTrainees(String traineeName,String traineeMail,int traineeId) throws Exception
	{
		Connection con=this.getConnection();
		String query=String.format("update trainee set trainee_name='%s',trainee_mail='%s' where trainee_id=%d",traineeName,traineeMail,traineeId) ;
		 
		 Statement st=con.createStatement();
		 int rs =st.executeUpdate(query);
		 System.out.println(rs);
		 st.close();
		 con.close();

		
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

	public void updateCourse(String courseName,String courseProvider,int courseId) throws Exception
	{
		Connection con=this.getConnection();
		 Statement st=con.createStatement();
		String query=String.format("update course set course_name='%s',course_provider='%s' where course_Id=%d",courseName,courseProvider,courseId);
		 
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
    	String query=String.format("delete from topic where topicId=%d",topicId);
		Statement st=con.createStatement();
		int count=st.executeUpdate(query);
		System.out.println(count);
		st.close();
		con.close();
    	
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


	
}
