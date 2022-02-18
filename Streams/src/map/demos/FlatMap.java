package map.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Trainee{
	
	String tname;
	int tid;
	
	Trainee(String tname,int tid)
	{
		this.tname=tname;
		this.tid=tid;
	}
	
}

public class FlatMap {

	public static void main(String[] args) {
		
		List<Trainee> traineeList1=new ArrayList<Trainee>();
		traineeList1.add(new Trainee("Raja",111));
		traineeList1.add(new Trainee("Rani",112));
		
		List<Trainee> traineeList2=new ArrayList<Trainee>();
		traineeList2.add(new Trainee("Ram",113));
		traineeList2.add(new Trainee("sita",114));
		
		List<List<Trainee>> traineeList=Arrays.asList(traineeList1,traineeList2);
		
		List<String> names=traineeList.stream()
				.flatMap(trlist->trlist.stream())
				.map(s->s.tname)
				.collect(Collectors.toList());
		
		System.out.println(names);

		
		

	}

}
