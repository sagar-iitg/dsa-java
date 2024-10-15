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
            heapify(arr,i,n);
        }
    }
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
    private static void swap(int[] arr,int first,int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
