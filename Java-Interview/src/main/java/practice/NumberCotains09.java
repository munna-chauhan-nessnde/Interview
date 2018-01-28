package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberCotains09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = 10000;
        System.out.println(vaiMath(n));
        String number;
        int count = 0;
        boolean isMatch;
        for (int i = 1; i < n; i++) {
            isMatch = true;
            number = String.valueOf(i);
            for (int counter = 0; counter < number.length() && isMatch; counter++) {
                char c = number.charAt(counter);
                if (c != '0' && c != '9') {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                System.out.print(number + ", ");
            }
        }
    }

    private static List<Integer> vaiMath(int n) {

        List<Integer> numbers = new ArrayList<>();
        int size = 0;
        int value = 0;
        for (int i = 1; i < String.valueOf(n).length(); i++) {
            value = (int) Math.pow(10, i) - (int) Math.pow(10, i - 1);
            System.out.println(value);
            size = (int) Math.pow(2, i - 1);
            while (size >= 0) {
                if (size % 2 == 0) {
                    numbers.add(value);
                    value = value + 9;
                } else if (size % 2 != 0) {
                    numbers.add(value);
                    value = value + 81;
                }
                size--;
            }
        }
        return numbers;
    }

    private static int check(int n) {
        boolean isMatch = true;
        String number = String.valueOf(n);
        for (int counter = 0; counter < number.length() && isMatch; counter++) {
            char c = number.charAt(counter);
            if (c != '0' && c != '9') {
                isMatch = false;
                break;
            }
        }//1,2,4,8,16
        if (isMatch) {
            return n;
        }
        return 0;
    }
}
