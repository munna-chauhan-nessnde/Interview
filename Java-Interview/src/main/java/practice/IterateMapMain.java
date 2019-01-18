package practice;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IterateMapMain {

    public static void main(String args[])
    {
        // HashMap with Country as key and capital as value
        Map<String,String> map=new ConcurrentHashMap<>();
        map.put("India","Delhi");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("Russia","Moscow");


        // Iterating java iterator
/*        System.out.println("Iterating java Iterator");
        Iterator<String> countryKeySetIterator=map.keySet().iterator();
        while(countryKeySetIterator.hasNext()){
            String countryKey=countryKeySetIterator.next();
            map.put("Nepal", "KathMandu");
            System.out.println(countryKey);

        }
        System.out.println("-----------------------------");*/

        for(Map.Entry<String, String> m : map.entrySet()){
            if(m.getKey().length()==5){
                map.put("China", "Bijing");
                map.remove(m.getKey());
            }
        }
        System.out.println(map);
    }
}
