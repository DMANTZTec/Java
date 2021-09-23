class student
{
	int id;
	String name;
   public student()
   {
	   id=76;
	   name="swapna";
   }
}
public class Studentarray
{
  public static void main(String[]args)
  {
	  student s1=new student();
	  student s2=new student();
	  student s3=new student();
	  student s4=new student();
	  
	  student s[]= {s1,s2,s3,s4};
	  
	  System.out.println(s[s1]);	
	}
  }
	
	

