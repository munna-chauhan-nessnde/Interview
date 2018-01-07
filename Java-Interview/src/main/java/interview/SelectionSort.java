package interview;

import java.util.Arrays;

/**
 * @Author Munna Chauhan
 * Github https://github.com/victormunna/Interview
 * Sorting -> Selection Sort -> slow Sorting algorithm
 * <p>
 * In-Place sorting algorithms takes constant amount of extra memory.
 * <p>
 * Time Complexity
 * time constant for min in loop 1 is c1 and time is (n-1)
 * time constant for if-block in loop 2 is c2 and time is (n*(n-2)/2)
 * time constant for swap method is c3 and time is (n-1)
 * <p>
 * Then Time T[n) = c1 (n-1) + c2 (n*(n-2)/2) + c3 (n-1)
 * T(n) = an^2 + bn + c
 * So   T(n) = o(n^2)
 */
public class SelectionSort {

    private static void selectionSort(int[] array) {

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }

    private static void swap(int[] array, int i, int min) {

        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }

    public static void main(String[] args) {

        int[] array = {6, 9, 3, 5, 7, 6, 12, 1, 2, 3, 8, 1, 2, 4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}