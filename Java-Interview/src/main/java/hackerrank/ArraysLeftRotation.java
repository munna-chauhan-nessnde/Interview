package hackerrank;

import java.util.Scanner;

public class ArraysLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int n = a.length;
        int[] ar = new int[a.length];
        int index = d % n;

        for (int i = 0; i < n; i++) {

            if (index < n) {
                ar[i] = a[index];
            } else {
                ar[i] = a[index - n];
            }
            index++;
        }

        return ar;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int p = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\n[ ");
        for (int i : rotLeft(arr, p)) {
            System.out.print(i + " ");
        }
        System.out.println("]\n");
    }
}
