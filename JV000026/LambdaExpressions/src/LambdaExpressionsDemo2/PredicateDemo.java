package LambdaExpressionsDemo2;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) { // example1
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(20));
		// example2
		Predicate<String> pr = s -> (s.length() > 4);
		System.out.println(pr.test("Heroin"));
		// example3

		String name[] = { "Harish", "Kiran", "raju", "Madhu", "rani" };
		for (String names : name) {
			if (pr.test(names) == false) {
				System.out.println(names);
			}
		}

	}

}
