package com.dmantz.swapna.dls.training.managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Director {
	
		
	public String addTrianee(int traineeId, String traineeName,String traineeAddress)
	{
		try {
			String query = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dmantzlearningsystem","root","swapna2021");
		Statement st=con.createStatement();
	    query=String.format("insert into trainee values('%d','%s','%s')",traineeId,traineeName,traineeAddress);
	
		int count=st.executeUpdate(query);
		System.out.println(count +"row/s affected");
		
		st.close();
		con.close(); }catch(Exception e) {System.out.println(e);}
		
		return  "trianee added successfully";
	}
	

}
