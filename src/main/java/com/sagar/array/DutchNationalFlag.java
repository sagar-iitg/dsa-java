package com.sagar.array;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr={2,2,2,0,0,1,2,1,1,0,0,2,0,1,0,1,2,1};
        System.out.println(Arrays.toString(arr));
        int start=0;
        int mid=0;
        int end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==2){
                swap(arr,mid,end);
                end--;
            }
            else if(arr[mid]==0){
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else if(arr[mid]==1){
             mid++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
