package hackerrank;

import java.util.Scanner;

public class SourGlassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int m = 3;
        int n = arr.length;
        int largestGlassHour = Integer.MIN_VALUE;
        for (int i = 0; i < n - m + 1; i++) {
            for (int j = 0; j < n - m + 1; j++) {
                int sum = 0;
                int row = i;
                for (int k = 0; k < 3; k++) {

                    if (k == 1) {
                        sum = sum + arr[row + k][j + 1];
                    } else {
                        sum = sum + arr[row + k][j] + arr[row + k][j + 1] + arr[row + k][j + 2];
                    }
                }
                if (sum > largestGlassHour) {
                    largestGlassHour = sum;
                }
            }
        }
        return largestGlassHour;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(hourglassSum(arr));
    }
}
