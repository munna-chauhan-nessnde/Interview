package pattern;

import java.util.Scanner;

/**
 * Right angle Pattern ->                   *
 *                                          *  *
 *                                          *  *  *
 *                                          * *  *  *
 *                                          * * *  *  *
 */
public class InverseRightAnglePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= n; j++) {
                if (j >= n - i) System.out.print(" *");
                else System.out.print("  ");

            }
            System.out.println();
        }
    }
}
