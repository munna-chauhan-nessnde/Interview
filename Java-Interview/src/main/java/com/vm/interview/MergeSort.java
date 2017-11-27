package com.vm.interview;

import java.util.Arrays;

import static java.lang.System.arraycopy;
import static java.lang.System.out;

/**
 * @Author Munna Chauhan
 * Github  https://github.com/victormunna/Interview
 * Sorting -> Merge sort
 * it's used (1)Divide and Conquer (2)Recursion (3)Stable (4)Not In-Place
 * Space complexity O(n) or thita(n)
 * Time Complexity in worst case: O(n*logn)
 */
public class MergeSort {

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];
/*        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }*/
        arraycopy(array, 0, left, 0, middle);
/*        for (int i = middle; i < length; i++) {
            right[i - middle] = array[i];
        }*/
        arraycopy(array, middle, right, 0, length - middle);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {

        int leftLength = left.length;
        int rightLength = right.length;

        int i = 0; //for left Array
        int j = 0; //for right Array
        int k = 0; //for main Array

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] array = {3, 5, 9, 1, 6, 7, 8, 2, 4};
        mergeSort(array);
        out.println(Arrays.toString(array));
    }

}