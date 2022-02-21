package LambdaExpressionsDemo;

interface polindrome {
	public void check(int n);
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polindrome abc = (n) -> {
			int s = 0;
			int t = n;
			while (n > 0) {
				int r = n % 10;
				s = (s * 10) + r;
				n = n / 10;
			}
			if (t == s) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		};
		abc.check(101);

	}

}
