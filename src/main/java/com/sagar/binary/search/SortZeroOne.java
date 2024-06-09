package com.sagar.binary.search;

import java.util.Arrays;

public class SortZeroOne {


    public static void main(String[] args) {
        int[] arr={0,0,1,0,0,1,0,1,0,0,1,1,1,0,1,0};



        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==0) i++;
            else{
                swap(arr,i,j);
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
