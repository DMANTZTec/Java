package filter.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	 
}

public class FilterDemo3 {

	public static void main(String[] args) {
		
		List<Product>productsList=new ArrayList<Product>();
		
		productsList.add(new Product(1,"Apple",1000));
		productsList.add(new Product(2,"Samsung",100));

		productsList.add(new Product(3,"onePlus",10));
		
		List<Double> productsPriceList=productsList.stream()
		.filter(p->p.price>10)
		.map(p->p.price)
		.collect(Collectors.toList());
		System.out.println(productsPriceList);
	
		//.forEach(System.out::println);
		//.forEach(pr->System.out.println(pr.price+ " " + pr.name));

		
		
	}

}
