package LambdaExpressionsDemo2;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> abc = (n) -> {
			int s = 0;
			int t = n;
			while (n > 0) {
				int r = n % 10;
				s = (s * 10) + r;
				n = n / 10;
			}
			if (t == s) {
				return true;
			} else {
				return false;
			}

		};
		System.out.println(abc.test(202));
//example 2
		for (int a = 1; a <= 1000; a++) {

			if (abc.test(a)) {
				System.out.println(a);
			}
		}

	}

}
