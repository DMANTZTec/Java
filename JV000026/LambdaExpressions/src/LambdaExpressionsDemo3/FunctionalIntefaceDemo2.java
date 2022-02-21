package LambdaExpressionsDemo3;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String eName;
	int eSal;

	public Employee(String eName, int eSal) {
		super();
		this.eName = eName;
		this.eSal = eSal;
	}

}

public class FunctionalIntefaceDemo2 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList();
		al.add(new Employee("kiran", 10000));
		al.add(new Employee("kiran", 15000));
		al.add(new Employee("kiran", 35000));
		al.add(new Employee("kiran", 25000));
		al.add(new Employee("raju", 30000));
		Function<Employee, Integer> fn = e -> {
			int sal = e.eSal;
			if (sal >= 10000 && sal <= 20000) {
				sal = sal * 10 / 100;
				return sal;
			} else if (sal >= 20000 && sal <= 30000) {
				sal = sal * 20 / 100;
				return sal;
			} else if (sal >= 30000 && sal <= 40000) {
				sal = sal * 30 / 100;
				return sal;
			} else {
				sal = sal * 40 / 100;
				return sal;
			}

		};
		Predicate<Integer> pr = b -> b > 5000;
		for (Employee e : al) {
			if (pr.test(fn.apply(e))) {
				System.out.println(e.eName + " " + e.eSal);
				System.out.println(fn.apply(e));
			}

		}

	}

}
