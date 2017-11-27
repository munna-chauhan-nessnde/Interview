package com.vm.interview;

import java.util.Arrays;

/**
 * @Author Munna Chauhan
 * Github https://github.com/victormunna/Interview
 * Sorting -> Bubble sort
 * Bubble Sort Time complexity:
 * in Best Case: Big-Oh(n^2) in average case: O(n^2) and in Worst Case: O(n^2)
 */
public class BubbleSort {

    private static void bubbleSort(int[] array) {

        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {

                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }

    private static void swap(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 9, 3, 5, 7, 8, 1, 2, 4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}