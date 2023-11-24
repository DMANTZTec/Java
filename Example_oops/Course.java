package Example_oops;

class Student 
{
	private int id;
	private String name;
	private Course course;

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
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
	public Student getHisInfo() 
	{
	  Student s= new Student();
         s.setId(this.id);
         s.setName(this.name);
         s.setCourse(this.course);
         return s;
	}

	public Course getHisCourse() 
	{
		return getCourse();	
	}
	public Student Update(Course course) 
	{
		Student s=getHisInfo();
		s.setCourse(course);
		return s;
	}
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
}

public class Course

{
	private int courseId;
	 private String courseName;

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}

}