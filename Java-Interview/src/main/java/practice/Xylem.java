package practice;

import java.util.*;

public class Xylem {

    public static void main(String[] args) {
        System.out.println(rearrange(Arrays.asList(5,3,7,10,14)));
        HashMap m = new HashMap();
        m.clear();
        int s = 01;
    }

    public static List<Integer> rearrange(List<Integer> elements) {
        // Write your code here
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for(Integer in :  elements){
            String key = Integer.toBinaryString(in);
            char[] chr = key.toCharArray();
            int count =0;
            int count0 =0;
            for(int i=0; i<key.length();i++){
                if(chr[i]=='1'){
                    count++;
                }else{
                    count0++;
                }
            }
            List<Integer> l = map.get(count);
            if(l == null){
                l =new ArrayList<>();
                l.add(in);
            }else{
                l.add(in);
            }
            map.put(count,l);
        }
        List<Integer> list = new LinkedList<>();
        map.forEach((k , v) -> {
            Collections.sort(v);
            for (Integer integer : v) {
                list.add(integer);
            }
        });
        return list;
    }
}
