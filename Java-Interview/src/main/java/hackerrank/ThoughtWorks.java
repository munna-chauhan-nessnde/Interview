package hackerrank;

import java.util.Scanner;

public class ThoughtWorks {

    private static String trickOrTreat(int[] arr, int c) {

        int size = arr.length;
        int binaryLimit = (1 << size) - 1;
        for (int i = 1; i <= binaryLimit; i++) {
            int index = size - 1;
            int num = i;
            int sum = 0;
            while (num > 0) {
                if ((num & 1) == 1) {
                    System.out.print(arr[index] + " ");
                    sum = sum + arr[index];
                    if (sum == c) {
                        return "YES";
                    }
                }
                index--;
                num >>= 1;
            }
            System.out.println();
        }
        return "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int b = sc.nextInt();
            int[] arr = new int[b];
            for (int j = 0; j < b; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(trickOrTreat(arr, sc.nextInt()));
        }
    }

    private void findCombinationsUtil(int arr[], int index, int num, int reducedNum) {

        if (reducedNum == 0) {
            for (int i = 0; i < index; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            return;
        }
        int prev = (index == 0) ? 1 : arr[index - 1];
        for (int k = prev; k <= num; k++) {
            arr[index] = k;
            findCombinationsUtil(arr, index + 1, num, reducedNum - k);
        }
    }

}
