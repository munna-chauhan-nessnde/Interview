package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> nm = new ArrayList<>();
        List<Integer> ij = new ArrayList<>();
        int t = sc.nextInt();
        for (int a = 0; a < t; a++) {
            nm.add(sc.nextInt());
            nm.add(sc.nextInt());
            ij.add(sc.nextInt());
            ij.add(sc.nextInt());
        }
        for (int a = 0; a < ij.size(); a += 2) {
            System.out.println((ij.get(a) + 1) * (ij.get(a + 1) + 1));
        }
    }
}
/* Input
3
4 4
3 3
5 6
3 5
2 4
1 2
*/
