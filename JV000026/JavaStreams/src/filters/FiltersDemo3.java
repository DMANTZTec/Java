package filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=Arrays.asList("kiran",null,"giri","hari");
		List<String> list2=new ArrayList();
		list2=list1.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.println(list2);

	}

}
