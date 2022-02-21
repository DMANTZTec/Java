package LambdaExpressionsDemo2;

import java.util.function.Predicate;

public class PredicateDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65 };
		Predicate<Integer> p1 = i -> (i % 2 == 0);
		Predicate<Integer> p2 = i -> (i > 50);
		// and
		for (int b : a) {
			if (p1.and(p2).test(b)) {
				System.out.println("both satisfies" + "   " + b);
			}
		}
		// or
		for (int b : a) {
			if (p1.or(p2).test(b)) {
				System.out.println("only one satisfies" + "  " + b);
			}
		}
		for (int b : a) {
			if (p1.negate().test(b)) {
				System.out.println(b);
			}
		}
		for (int b : a) {
			if (p2.negate().test(b)) {
				System.out.println(b);
			}
		}
	}

}
