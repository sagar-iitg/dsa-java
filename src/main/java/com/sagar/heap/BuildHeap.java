package com.sagar.heap;

import java.util.Arrays;

public class BuildHeap {

    public static void main(String[] args) {
        int[] arr={14,15,12,22,17,20,18,24,23,30,19};
        buildMaxHeap(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void buildMaxHeap(int[] arr,int n){
        //step down
        for(int i=(n/2)-1;i>=0;i--){
            heapify1(arr,i,n);
            //[30, 24, 20, 23, 19, 12, 18, 22, 14, 17, 15]
        }
    }

    //recursion
    private static void heapify(int[] arr,int index,int n){
        int largest=index;
        int left=2*index+1;
        int right=2*index+2;

        //for min heap change sign <
        if( left<n && arr[left]> arr[largest]){
            largest=left;
        }
        //for min heap change sign <
        if( right <n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=index){
            swap(arr,largest,index);
            heapify(arr,largest,n);
        }

    }
    //iterative
    private static void heapify1(int[] arr,int index,int size){
        while(index<size) {

            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && arr[largest] < arr[left]) {
                largest = left;
            }

            if (right < size && arr[largest] < arr[right]) {
                largest = right;
            }

            if (largest == index) {
                return;
            } else {
                swap(arr, largest, index);
                index = largest;
            }
        }

    }
    private static void swap(int[] arr,int first,int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
