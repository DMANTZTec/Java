package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomerUpdate {
	
	public static void main(String[] args)throws Exception {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusafeb","root","Rakesh@1999");
		Statement statement=connection.createStatement();
		int result=statement.executeUpdate("insert into customer values(5,'vamshi','vam','canada') ");
		
		System.out.println(result+" " + "rows effected");
	}

}
