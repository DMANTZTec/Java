package filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int productId;
	String productName;
	int price;
	public Product(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}


}

public class FilterDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productlist=new ArrayList();
		productlist.add(new Product(1,"samsung",15000));
		productlist.add(new Product(2,"redmi",12000));
		productlist.add(new Product(3,"realme",13000));
		productlist.add(new Product(4,"nokia",5000));
		productlist.add(new Product(5,"sony",10000));
		productlist.add(new Product(6,"iphone",35000));
		List<Product> list2=new ArrayList();
		productlist.stream().filter(p->p.price>12000 && p.price<40000).forEach(n->System.out.println(n.price));
 
		

	}

}
