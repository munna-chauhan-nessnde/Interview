package pattern;

import java.util.Scanner;

/**
 * Pyramid Pattern ->                    *
 *                                         *   *
 *                                       *   *   *
 *                                     *   *   *   *
 *                                   *   *   *   *   *
 */

public class PyramidPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= n; j++) {
                if (j >= n - i) System.out.print(" *");
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
