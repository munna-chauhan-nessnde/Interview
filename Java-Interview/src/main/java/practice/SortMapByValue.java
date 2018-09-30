package src.main.java.practice;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {

    // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
        // Sort the list
        Collections.sort(list, Comparator.comparing(o -> (o.getValue())));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // Driver Code
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 98);
        map.put("Data Structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);
        map.put("JAVA", 95);

        Map<String, Integer> sortedByValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedByValue);
        //sortByValue(hm);

/*        for (Map.Entry<String, Integer> en : hm.entrySet()) {
            System.out.println(en.getKey() +
                    " = " + en.getValue());
        }*/
    }
}
