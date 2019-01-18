package hackerrank;

import java.util.Scanner;

public class CountApplesAndOranges {


    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int apple = 0;
        int orange = 0;
        for(int m : apples){
            if(a-m>=s && a-m<=t){
                apple++;
            }
        }
        System.out.println(apple);
        for(int n : oranges){
            if(b-n>=s && b-n<=t){
                orange++;
            }
        }
        System.out.println(orange);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] apples = new int[m];
        int[] oranges = new int[n];
        for (int i = 0; i < m; i++) {
            apples[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            oranges[i] = sc.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
