package practice;

import java.util.Scanner;

class solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[2 * n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
        for (int i = 0; i < array.length; i = i + 2) {
            //checkChromosomeOrder(array[i], array[i + 1]);
            findChromosome(array[i], array[i + 1]);
        }
    }

    private static void checkChromosomeOrder(String k, String v) {

        char[] input = v.toCharArray();
        int size = 0;
        for (int i = 0; i < input.length; i++) {
            int ind = k.indexOf(input[i]);
            if (ind != -1) {
                k = k.substring(ind + 1, k.length());
                size++;
            }
        }
        if (size == input.length)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static void findChromosome(String k, String v) {

        char[] cromosome = k.toCharArray();
        int index = 0;
        for (int i = 0; i < cromosome.length; i++) {
            if (cromosome[i] == v.charAt(index) && index < v.length()) {
                index++;
            }
        }
        if (index == v.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
