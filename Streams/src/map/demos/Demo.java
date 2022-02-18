package map.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		List<String> aList=Arrays.asList("a","b");
				List<String> bList=Arrays.asList("c","d");
				
				Stream <String>stream1=aList.stream();
				Stream <String>stream2=bList.stream();
				
				List<String> finalList=Stream.concat(stream1,stream2).collect(Collectors.toList());
				
				for(String item:finalList) {
					System.out.println(item);
				}
				
		

	}

}
