package hackerrank;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {

        /*-----------------First Type Input as a String---------------------*/
        String s = "1 2 3 4 For 10 5 for 2 6 c FOR 3 A";
        String str = String.join("FOR", s.split(" [a-zA-Z]{3} "));
        System.out.println(str);

        BiFunction<Object, Integer, String> biFunction = (input, count) -> IntStream.range(0, count)
                .mapToObj(i -> String.valueOf(input))
                .collect(Collectors.joining(","));

        String outPut = Arrays.stream(str.split(" "))
                .map(e -> parse(biFunction, e))
                .collect(Collectors.joining(","));

        System.out.println(outPut);

        /*-----------------Second Type Input as a CharArray---------------------*/

        char[][] charArray = {{'1'}, {'2'}, {'3'}, {'4', '4', '4', '4', '4', '4', '4', '4', '4', '4'}, {'5', '5'}, {'6'}, {'c', 'c', 'c'}, {'A'}};

        String outPut1 = Arrays.stream(charArray)
                .map(e -> IntStream.range(0, e.length)
                                   .mapToObj(i -> String.valueOf(e[i]))
                                   .collect(Collectors.joining(",")))
                .collect(Collectors.joining(","));

        System.out.println(outPut1);

    }

    private static String parse(BiFunction<Object, Integer, String> biFunction, String e) {

        if (e.contains("FOR")) {
            String[] sAry = e.split("FOR");
            return biFunction.apply(sAry[0], Integer.parseInt(sAry[1]));
        }
        return biFunction.apply(e, 1);
    }
}
