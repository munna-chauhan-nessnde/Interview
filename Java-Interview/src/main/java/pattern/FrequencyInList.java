package pattern;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyInList {

    public static void main(String[] args) {

        List<String> samples = Stream.of("India", "China", "Bangalore", "Delhi",
                "India", "Bangalore", "China", "Kolkata", "India", "Mumbai", "India").collect(Collectors.toList());

        //1. Using Set and Collections frequency method
        Set<String> uniqe = new HashSet<>(samples);
        for (String data : uniqe) {
            System.out.println(data + " - " + Collections.frequency(samples, data));
        }
        //2. Using Map
        Map<String, Integer> map = new HashMap<>();
        for (String data : samples) {
            Integer count = map.get(data);
            map.put(data, (count == null) ? 1 : count + 1);
        }
        System.out.println(map);

        //3. Using Stream API
        Map<String, Long> counts =
                samples.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counts);
    }
}
