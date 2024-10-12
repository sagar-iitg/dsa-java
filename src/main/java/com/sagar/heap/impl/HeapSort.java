package com.sagar.heap.impl;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {12, 23, 90, 2, 34, 43, 9};
        heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr, int n) {
        // Step 1: Build the max heap
        buildHeap(arr, n);

        // Step 2: Perform heap sort
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to the end
            swap(arr, 0, i);

            // Heapify the reduced heap from the root
            heapify(arr, i, 0);  // Use i as the new size of the heap
        }
    }

    static void buildHeap(int[] arr, int n) {
        // Build a max heap by heapifying from the last non-leaf node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int leftIndex = 2 * i + 1; // left child index
        int rightIndex = 2 * i + 2; // right child index

        // Check if left child exists and is greater than root
        if (leftIndex < n && arr[leftIndex] > arr[largest]) {
            largest = leftIndex;
        }

        // Check if right child exists and is greater than largest so far
        if (rightIndex < n && arr[rightIndex] > arr[largest]) {
            largest = rightIndex;
        }

        // If the largest is not root, swap and continue heapifying
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest); // Recursive call to heapify the affected subtree
        }
    }

    // Utility method to swap two elements in an array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
