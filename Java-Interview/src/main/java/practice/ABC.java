package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ABC {


    public static void main(String[] args) {
        System.out.println(minimumMoves(Arrays.asList("rice", "sugar","ghee"), Arrays.asList(15f,300.90f, 23.44f), Arrays.asList("sugar", "ghee", "rice"), Arrays.asList(300.90f, 23.44f, 10f)));
    }

    public static int minimumMoves(List<String> origItems, List<Float> origPrices, List<String> items, List<Float> prices) {

        Map<String, Float> f = new HashMap<>();
        Map<String, Float> s = new HashMap<>();
        for (int i = 0; i < origItems.size(); i++) {
            f.put(origItems.get(i), origPrices.get(i));
        }
        for (int i = 0; i < items.size(); i++) {
            s.put(items.get(i), prices.get(i));
        }
        int count = 0;
        if (f.size() > s.size()) {
            for (String str : items) {
                float k = f.get(str);
                float v = s.get(str);
                if ( k!= v) {
                    count++;
                }
            }
        } else {
            for (String str : origItems) {
                float k = f.get(str);
                float v = s.get(str);
                if ( k!= v) {
                    count++;
                }
            }
        }
        return count;
    }
}
