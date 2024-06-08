package com.sagar.binary.search;

public class FindPivotElementInSortedArray {

    public static void main(String[] args) {

        int[] arr={4,5,6,7,8,9,10,11,0,1,2};

        int pivotIndex=pivot(arr,0,arr.length-1);
        //System.out.println(pivotIndex);
        System.out.println(arr[pivotIndex]);
    }

    private static int pivot(int[] arr, int start, int end) {

        if(start>end) return -1;
        int mid=(start+end)>>>1;

        if(arr[mid]>arr[mid+1]) return  mid;
        if( arr[mid]<arr[mid-1]) return  mid-1;
        if(arr[mid]<=arr[start]) return pivot(arr,start,mid-1);
        else return pivot(arr,mid+1,end);

    }
}
