package pattern;

import java.util.Scanner;

/**
 * Right angle Pattern -> *
 *                        * *
 *                        * * *
 *                        * * * *
 *                        * * * * *
 *                        * * * * * *
 */
public class RightAnglePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int i, j;
//        for (i = 0; i < n; i++) {
//            for (j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        String s = new String(new char[2*n]).replace("\0", " ");
        StringBuilder sb = new StringBuilder(s);
        for(i=0 ; i < n; i++){
            sb.setCharAt(2*n-1-2*i, '*');
            System.out.println(sb);
        }
    }
}
