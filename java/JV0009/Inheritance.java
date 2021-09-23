 class Employee//creating parent class
 {
	 float salary=10000;
 }
 class programmer extends Employee//creating child class which inherits the parent class
 {
	 float bonus=4000;
 }
 class developer extends Employee//creating child class which inherits the parent class
 {
	 float bonus=3000;
	 public float salary()// 
	 {
		 //System.out.println("developer salary is :"+(salary+bonus));
		 return salary+bonus;
	 }
 }
public class Inheritance {

	public static void main(String[] args) {
	programmer p=new programmer();
	developer d=new developer();
	d.salary();
	//System.out.println("Programmer salary is:"+p.salary);
	//System.out.println("Bonus of programmer is:"+p.bonus);
	//System.out.println("Salary of developer is:"+p.salary);
	//System.out.println("Bonus of developer is:"+d.bonus);
	System.out.println("developer salary is :"+(p.salary+d.bonus));

	}

}
