package com.amulya.training.dls.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.amulya.training.dls.common.Trainee;

public class Director {
	private Connection getConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/amulya_dls";
		String uname="root";
		String pass="Mammu@1412";
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(url, uname, pass);
		return con;

		
	}
	
	public void addTrainee(int traineeId,String traineeName,String traineeEmail,int courseId) throws Exception {
		Connection con = this.getConnection();
		String q = String.format("insert into trainee values(%d,'%s','%s',%d)",traineeId,traineeName,traineeEmail,courseId);
		Class.forName("com.mysql.cj.jdbc.Driver"); //load and register
		 //create connection
		Statement st= con.createStatement();
	    int count =st.executeUpdate(q); 
		System.out.println(count +" rows affected");
		st.close();
		con.close();
	}
	
    public void removeTrainee(int traineeId) throws Exception {
    	Connection con = this.getConnection();
		String q = String.format("delete from trainee where trainee_id=%d",traineeId);
		Class.forName("com.mysql.cj.jdbc.Driver"); //load and register
		Statement st= con.createStatement();
	    int count =st.executeUpdate(q); 
	    System.out.println(count +" rows affected");
		st.close();
		con.close();
	
		
	}
   
}
