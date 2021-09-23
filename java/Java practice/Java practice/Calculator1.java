
public class Calculator1 {
	int a,b;
	Calculator1(int a, int b){
		this.a = a;
		this.b = b;
	}
	void add() {
		int c; 
		c= a+b;
		System.out.println(c);
	}
	void sub() {
		int d;
		d= a-b;
		System.out.println(d);
	}
	void mul() {
		int e;
		e = a*b;
		System.out.println(e);
	}
	public static void main(String[] args ) {
		Calculator1 i = new Calculator1(9,7);
		i.add();
		i.sub();
		i.mul();
	}

}
