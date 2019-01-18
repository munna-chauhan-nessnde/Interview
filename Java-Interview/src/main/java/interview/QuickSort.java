package interview;

import java.util.Arrays;

/**
 * @Author Munna Chauhan
 * Github https://github.com/victormunna/Interview
 * Quick sort
 * In-Place
 * Time Complexity in
 * average case: O(n*logn)
 * worst case: O(n^2)
 */
public class QuickSort {

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {

        if (left >= right) {
            return;
        }
        int index = partition(array, left, right);

        quickSort(array, left, index - 1);
        quickSort(array, index, right);

    }

    private static int partition(int[] array, int left, int right) {

        int pivot = array[(left + right) / 2];
        while (left < right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array, int left, int right) {

        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {

        int[] array = {6, 5, 4, 3, 7, 5, 4, 2};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}