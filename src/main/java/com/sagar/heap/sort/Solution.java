package com.sagar.heap.sort;

import java.util.Arrays;

public class Solution {
    public static int[] sortArray(int[] arr) {
        int n=arr.length;
        buildHeap(arr,n);
        // Step 2: Perform heap sort
        System.out.println("MaxHeap"+Arrays.toString(arr));
        for (int i = n -1; i > 0; i--) {
            // Move current root (largest) to the end
            swap(arr, 0, i);
            heapify(arr, i, 0);  // Use i as the new size of the heap
        }
        return arr;

    }
    //Heapify function to maintain heap property.
    static void heapify(int arr[], int n, int i)
    {
        // Your code here
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

    static void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,n,i);
            //[30, 24, 20, 23, 19, 12, 18, 22, 14, 17, 15]
        }
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr={10,30,40};
        System.out.println("Actual Array"+Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArray(arr)));


    }
}