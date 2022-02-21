package LambdaExpressionsDemo3;

import java.util.function.Function;

public class FunctionalInterface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f1=b->b*2;
		Function<Integer,Integer> f2=b->b*b*b;
		System.out.println(f1.andThen(f2).apply(4));
		System.out.println(f1.compose(f2).apply(4));

	}

}
