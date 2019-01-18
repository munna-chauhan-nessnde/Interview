package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (long i = 0; i < n; i++) {
            BigInteger bigInteger = sc.nextBigInteger();
            System.out.println(bigInteger.multiply(BigInteger.TWO).add(BigInteger.ONE));
        }
    }
}
