package com.sagar.heap.impl;

import java.util.Arrays;
import java.util.Collections;

public class Heapify {

    public static void main(String[] args) {
// Test case: array that is not a max heap
        int[] arr = {3, 9, 2, 1, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Let's heapify the array starting from the last non-leaf node
        int n = arr.length;

        // Heapifying the entire array (from the last parent node downwards)
        // This ensures a complete max-heap is formed
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        System.out.println("Heapified array (Max-Heap): " + Arrays.toString(arr));
    }



    private static void heapify(int[] arr,int n,int i){

        int index=i;
        int leftIndex=2*i+1;
        int rightIndex=2*i+2;
        int largest=index;

        if(leftIndex<n && arr[largest]<arr[leftIndex]){
            largest=leftIndex;
        }
        if(rightIndex<n && arr[largest]<arr[rightIndex]){
            largest=rightIndex;
        }
        if(index!=largest){
            // left or child is greater then current node
            swap(arr,index,largest);
            index=largest;
            heapify(arr,n,index);
        }

    }
    // Utility method to swap two elements in an array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];  // Store the element at index i
        array[i] = array[j];  // Assign the value at index j to index i
        array[j] = temp;      // Assign the stored value to index j
    }
}
