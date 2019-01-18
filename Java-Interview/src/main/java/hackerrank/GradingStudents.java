package hackerrank;

import java.util.Scanner;

public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                int n = (grades[i] / 5) + 1;
                if ((n * 5) - grades[i] < 3) {
                    grades[i] = n * 5;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : gradingStudents(arr)) {
            System.out.println(num);
        }
    }
}
