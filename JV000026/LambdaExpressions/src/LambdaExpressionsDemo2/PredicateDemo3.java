package LambdaExpressionsDemo2;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	int id;
	String name;
	int sal;
	int experience;

	public Employee(int id, String name, int sal, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.experience = experience;
	}

}

public class PredicateDemo3 {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Kiran", 40000, 4);
		Predicate<Employee> pr = e -> (e.sal > 30000 && e.experience > 3);
		System.out.println(pr.test(emp));
		ArrayList<Employee> al = new ArrayList();
		al.add(new Employee(1, "Kiran", 40000, 3));
		al.add(new Employee(2, "Raju", 20000, 2));
		al.add(new Employee(3, "naresh", 35000, 5));
		al.add(new Employee(4, "giri", 43000, 5));
		al.add(new Employee(5, "ramesh", 55000, 3));
		al.add(new Employee(6, "junnu", 60000, 2));
		al.add(new Employee(7, "vasu", 41000, 3));
//Example2
		for (Employee e : al) {
			if (pr.test(e)) {
				System.out.println(e.name + " " + e.sal);
			}
		}

	}

}
