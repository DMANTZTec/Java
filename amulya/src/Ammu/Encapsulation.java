package Ammu;
class Student1{
	private double marks=65;
	public int id;
	public String name;
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks+this.marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Student1 s= new Student1();
		s.setMarks(55);
		s.getMarks();
		System.out.println("student marks:"+s.getMarks());

	}

}
