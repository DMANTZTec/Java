package filter.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Amulya","Giri","Naresh","Harish","Swapna");
		List<String>shortNames=new ArrayList<String>();
		
		shortNames=names.stream().filter(str->str.length()>2&&str.length()<=4).collect(Collectors.toList());
		System.out.println(shortNames);
		
		names.stream().filter(str->str.length()>2&&str.length()<=4).forEach(str->System.out.println(str));
		
		
		
	}

}
