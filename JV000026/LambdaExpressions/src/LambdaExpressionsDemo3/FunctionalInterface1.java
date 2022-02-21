package LambdaExpressionsDemo3;

import java.util.function.Function;

public class FunctionalInterface1 {

	public static void main(String[] args) {
		Function<Integer,Integer> f=n->n*n;
		System.out.println(f.apply(2));
		System.out.println(f.apply(7));
		System.out.println(f.apply(25));
		Function<String,Integer> fn=n->n.length();
		System.out.println(fn.apply("rajamouli"));
		

	}

}
