package streams;
import java.util.Arrays;
import java.util.List;

class Student
    {
	   String name;
	   int marks;
	
     
       Student(String name,int marks)
       {
            this.name=name;
            this.marks=marks;
       }
       public String getName()
       {
    	   return this.name;
       }
       
       public int getMarks()
       {
    	   return this.marks;
       }
    }




public class ParallelStreamsDemo {

	public static void main(String[] args) {
		
		List<Student> studentList=Arrays.asList(
				new Student("ravi",55),
				new Student ("raj",88),
				new Student("tia",99));
		
		
		//stream - sequential
		studentList.stream().filter(s->s.getMarks()>80)
		.limit(1)
		.forEach(stu->System.out.println(stu.getName()+" "+stu.getMarks()));
		
		
		
		//parallel streams
		
		studentList.parallelStream().filter(s->s.getMarks()>80)
		//.limit(1)
		.forEach(stu->System.out.println(stu.getName()+" "+stu.getMarks()));
		

	}

}
