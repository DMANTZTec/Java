package jdbc;
import java.sql.*; //importing the library
public class jdbcdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/abc";  
		String uname="root";
		String pass="ganesh@321";
		String query="select sname from student where sid=3";
		Class.forName("com.mysql.cj.jdbc.Driver");//loading and register the driver using forName method
		Connection con=DriverManager.getConnection(url,uname,pass);//creating connection object by passing url,uname,password to the getConnection
		Statement st=con.createStatement(); //creating statement by using connection interface
		ResultSet rs=st.executeQuery(query);//executing the query using statement and storing that in rs(result set object)
		rs.next(); //to fetch the next record
		String name=rs.getString("sname");
		System.out.println(name); //printing the name
		st.close(); //closing statement
		con.close();//closing connection

	}

}
