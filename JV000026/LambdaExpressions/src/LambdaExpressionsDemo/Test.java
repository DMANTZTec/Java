package LambdaExpressionsDemo;

@FunctionalInterface
interface Cab {
	public String bookCab(String source, String destination);
}

public class Test {

	public static void main(String[] args) {
		Cab cab = (source, destination) -> {
			System.out.println("ola cab is booked from" + source + "to" + destination);
			return ("price : 9000");
		};
		System.out.println(cab.bookCab("kattangoor", "nalgonda"));

	}

}
