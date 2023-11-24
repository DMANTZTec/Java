package Example_oops;

public class Test_Course
{
  public static void main(String[] args) 
  {
	
	Course course1=new Course();
	course1.setCourseId(1);
	course1.setCourseName("java");
	
	
	Course course2=new Course();
	course2.setCourseId(2);
	course2.setCourseName("python");
	
	
	Course course3=new Course();
	course3.setCourseId(3);
	course3.setCourseName("angular");
	
	
	Student student1= new Student();
	
	student1.setId(1);
	student1.setName("vamshi");
	student1.setCourse(course3);
	
	
System.out.println(	student1.getHisInfo().getId()+"  "+student1.getHisInfo().getName()+ "  "+student1.getHisInfo().getCourse().getCourseId()+"  "+student1.getHisInfo().getCourse().getCourseName());

System.out.println("his course is"+student1.getHisCourse().getCourseId()+"  "+student1.getHisCourse().getCourseName());

student1.Update(course2);

System.out.println(student1.Update(course2).getHisCourse().getCourseId()+"  "+student1.Update(course2).getHisCourse().getCourseName());

	

  }
}
