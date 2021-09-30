package jdbc2;
import java.sql.*;
public class demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/abc";    
		String uname="root";
		String pass="ganesh@321";
		String query="select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");//loading and register the driver using forName method
		Connection con=DriverManager.getConnection(url,uname,pass);//creating connection object by passing url,uname,password to the getConnection
		Statement st=con.createStatement(); //creating statement by using connection interface
		ResultSet rs=st.executeQuery(query);//executing the query using statement and storing that in rs(result set object)
		
		while(rs.next()) //to fetch the next record
		{
		  String studentdata=rs.getInt(1)+":"+rs.getString(2);
		System.out.println(studentdata); //printing the student data
		}
		st.close(); //closing statement
		con.close();//closing connection

	}

}
