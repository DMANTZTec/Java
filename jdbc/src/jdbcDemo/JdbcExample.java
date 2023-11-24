package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JdbcExample {

	public static void main(String[] args) throws Exception {

		List<Customer> list = new ArrayList<Customer>();

		String query = "select * from customer";

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusafeb", "root", "Rakesh@1999");
		Statement smt = con.createStatement();
		ResultSet rst = smt.executeQuery(query);

		while (rst.next()) {

			Customer cust = new Customer();

			cust.setCustomerID(rst.getInt("customerId"));
			cust.setCustomerName(rst.getString("customerName"));
			cust.setContactName(rst.getString("contactName"));
			cust.setContry(rst.getString("contry"));
			list.add(cust);

		}
//		Iterator itr=list.iterator();
//		
//		while(itr.hasNext()) {
//			Customer c=  (Customer) itr.next();
//			System.out.println(c.getCustomerID()+" "+c.getContactName()+" "+c.getContactName()+" "+c.getContry());
//		}
		
		list.stream().forEach(	c->	
				System.out.println(c.getCustomerID()+" "+c.getCustomerName()+" "+c.getContactName()+" "+c.getContry())
);

			
			
		

	}

}
