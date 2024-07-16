package com.sagar.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CyclicSortTest {

    @Test
    public void testNormalCase() {
        int[] arr = {3, 1, 0, 2};
        cyclicSort(arr);
        assertTrue(isSorted(arr));
    }

    @Test
    public void testAlreadySorted() {
        int[] arr = {0, 1, 2, 3};
        cyclicSort(arr);
        assertTrue(isSorted(arr));
    }

    @Test
    public void testReverseSorted() {
        int[] arr = {3, 2, 1, 0};
        cyclicSort(arr);
        assertTrue(isSorted(arr));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {0};
        cyclicSort(arr);
        assertTrue(isSorted(arr));
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] arr = {3, 1, 2, 2};
        cyclicSort(arr);
        assertFalse(isSorted(arr)); // Duplicates are not a valid input for cyclic sort
    }

    @Test
    public void testArrayWithMissingElements() {
        int[] arr = {3, 1, 0, 4};
        cyclicSort(arr);
        assertFalse(isSorted(arr)); // Missing elements are not a valid input for cyclic sort
    }

    private void cyclicSort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == i) {
                i++;
            } else {
                swap(arr, i, arr[i]);
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return false;
            }
        }
        return true;
    }
}
