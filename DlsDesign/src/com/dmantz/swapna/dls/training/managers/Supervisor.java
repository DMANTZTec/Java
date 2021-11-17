package com.dmantz.swapna.dls.training.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Supervisor {
	
	public void assignCoursesToTrainees(int course_trainee_id,int courseId,int traineeId) throws Exception {
		
		String query=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dmantzlearningsystem","root","swapna2021");
		Statement st=con.createStatement();
		query=String.format("insert into course_trainee values(%d,%d,%d)",course_trainee_id,courseId,traineeId);
		int count=st.executeUpdate(query);
		System.out.println(count +"row/s affected");
		st.close();
		con.close();
		
		
		
	}
	public void viewDailyProgressofTrainees() throws Exception {
		String query=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dmantzlearningsystem","root","swapna2021");
		Statement st=con.createStatement();
		query=String.format("select * from worklog");
	    ResultSet rs=st.executeQuery(query);
	    String userdata="";
    	while(rs.next())
    	{
    		userdata=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+rs.getString(4)+" "+rs.getString(5);
    		System.out.println(userdata);
    	}
		
		st.close();
		con.close();
		
	}

}
