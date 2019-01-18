package hackerrank;

import java.util.Scanner;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int swap = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            if (min != i) {
                System.out.print("After swapping(" + i + ", " + min + ") we get arr: ");
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                swap++;
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
        }

        return swap;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumSwaps(arr));
    }
}
