package kkkk;



class TraineeManager{
	int Tmid;
	String Tmname;
	String Tmmail;
	
	public void AddTrainees()
	{
		System.out.println("adding trianees");
	}
	public void RemovingTrainees()
	{
		System.out.println("removing Trainees");
		
	}
	public void UpdateTrainees()
	{
		System.out.println("updating trainees");
	}
	public void AssigningCourses()
	{
		System.out.println("assigning courses");
	}
	class Trainees{
		int Tid;
		String Tname;
		String Tmail;
		public void Details()
		{
			System.out.println(Tid+" " +Tname +" "+Tmail);
			
		}
		
		public void Loging()
		{
			System.out.println("login to the course");
			
		}
		public void Learningcourse()
		{
			System.out.println("learning given courses");
		}
		public void Performingtasks()
		{
			System.out.println("performing given tasks");
		}
		public void Loggingout()
		{
			System.out.println("loging out");
		}
	
		class Course{
			String Cname;
			int Cduration;
			int Cid;
			
		}
	}
}

public class subclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraineeManager tm=new TraineeManager();
		
		TraineeManager.Trainees t1= tm.new Trainees();
		
		t1.Tname="vamshi";
		t1.Tid=1;
		t1.Tmail="bbbbb.@gmail.com";
		t1.Details();
		TraineeManager.Trainees.Course kj =t1.new Course();

	}

}
