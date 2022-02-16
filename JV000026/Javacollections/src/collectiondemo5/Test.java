package collectiondemo5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;


public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList<Book> booklist = new LinkedList();
		String url = "jdbc:mysql://localhost:3306/person";
		String uname = "root";
		String pass = "ganesh@321";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet srs = st.executeQuery("SELECT * FROM book");
		while (srs.next()) {
			Book bs = new Book();
			bs.setId(srs.getInt("id"));
			bs.setName(srs.getString("name"));
			bs.setStore(srs.getString("store"));
			booklist.add(bs);
		}
		Iterator it = booklist.iterator();
		while (it.hasNext()) {
			Book bsl = (Book) it.next();
		System.out.println(bsl.getId() + " " + bsl.getName()+" "+bsl.getStore());
	
		}


		st.close();
		con.close();

	}
}
