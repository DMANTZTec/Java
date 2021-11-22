package Ammu;

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
public class MethodOverriding1 {

	public static void main(String[] args) {
		parent ex= new child();
		ex.print();
		

	}

}


