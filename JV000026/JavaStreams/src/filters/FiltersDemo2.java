package filters;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FiltersDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=Arrays.asList("Kiran raju","amulya m","swpna","naresh","Giridhar");
		List<String> list2=new ArrayList();
		list2=list1.stream().filter(str->str.length()>9 && str.length()<18).collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
