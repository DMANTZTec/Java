package collectiondemo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Person> personlist=new ArrayList();
		String url = "jdbc:mysql://localhost:3306/person";
		String uname = "root";
		String pass = "ganesh@321";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet srs=st.executeQuery("SELECT * FROM person");
		 while(srs.next())
		 {
			 Person ps=new Person();
			 ps.setId(srs.getInt("id"));
			 ps.setName(srs.getString("name"));
			 ps.setJobtitle(srs.getString("jobtitle"));
			 personlist.add(ps);
		 }
		 Iterator it=personlist.iterator();
				 while(it.hasNext())
				 {
					 Person psl=(Person)it.next();
					 System.out.println(psl.getId()+" "+psl.getName());
				 }
   

		st.close();
		con.close();

	}
	Person getById(Integer id)
	{
		ArrayList<Person> personlist=new ArrayList();

		for(Person p:personlist)
		{
			if(p.getId()==id.intValue()) {
				return p;
			}
			System.out.println(p);
		}
			
		return null;
		
	}

}
