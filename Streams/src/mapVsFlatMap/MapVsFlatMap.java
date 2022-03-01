package mapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Trainee> trainees = TraineeDb.getAll();

        //List<Trainee>  convert List<String> -> Data Transformation
       //  one to one mapping
        
        List<String> emails = trainees.stream()
                .map(trainee -> trainee.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);
        
        

       // one to many mapping
        
        List<List<String>> courses = trainees.stream()
        		.map(trainee -> trainee.getCourses())
                .collect(Collectors.toList());
        System.out.println(courses);
        
        

        //List<Trainee>  convert List<String> -> Data Transformation
        // one to many mapping
        
        List<String> coursess = trainees.stream()
                .flatMap(trainee -> trainee.getCourses().stream())
                .collect(Collectors.toList());
        System.out.println(coursess);
    }
}
