package mapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TraineeDb {


    public static List<Trainee> getAll() {
        return Stream.of(
                new Trainee(101, "Amulya", "amulya@gmail.com", Arrays.asList("java", "python")),
                new Trainee(102, "Vamshi", "vamshi@gmail.com", Arrays.asList("python", "angular")),
                new Trainee(103, "Swapna", "swapna@gmail.com", Arrays.asList("angular", "java")),
                new Trainee(104, "Suresh", "suresh@gmail.com", Arrays.asList("kafka", "react"))
        ).collect(Collectors.toList());
    }


}