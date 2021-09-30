package jdbc;
import java.sql.*;
public class demo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/abc";    
		String uname="root";
		String pass="ganesh@321";
		int sid=4;
		String sname="aravindh";
		String query="insert into student values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");//loading and register the driver using forName method
		Connection con=DriverManager.getConnection(url,uname,pass);//creating connection object by passing url,uname,password to the getConnection
		PreparedStatement st=con.prepareStatement(query); //creating preparedstatement by passing query
		st.setInt(1, sid); //setting sid to the first column
		st.setString(2,sname); //setting sname to the second column
		int count=st.executeUpdate(); 
		System.out.println(count +"rows");
		st.close(); //closing statement
		con.close();//closing connection


	}

}
