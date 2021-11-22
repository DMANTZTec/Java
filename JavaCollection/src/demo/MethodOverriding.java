package demo;
class parent{
	public void print() {
		System.out.println("parent");
	}
}
class child extends parent{
	public void print() {
		System.out.println("child");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		parent ex= new child();
		ex.print();
		

	}

}
