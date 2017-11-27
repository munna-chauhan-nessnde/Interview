package com.vm.interview;

import java.util.Arrays;

/**
 * @Author Munna Chauhan
 * Github https://github.com/victormunna/Interview
 * Sorting -> Insertion Sort -> not the best Sorting algorithm but better than selection and bubble sort
 * Time Complexity in best case  T(n) = O(n)
 * Time Complexity in average and worst case  T(n) = O(n^2) like. Reverse sort
 */
public class InsertionSort {

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int checkPoint = i;

            while (checkPoint > 0 && array[checkPoint - 1] > value) {
                array[checkPoint] = array[checkPoint - 1];
                checkPoint--;
            }
            array[checkPoint] = value;
        }
    }

    public static void main(String[] args) {

        int[] array = {6, 9, 3, 5, 7, 6, 12, 1, 2, 3, 8, 1, 2, 4};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
