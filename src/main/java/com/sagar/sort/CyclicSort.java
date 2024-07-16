package com.sagar.sort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] arr={4,1,6,0,7,5,2,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {

        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i){
                i++;
                continue;
            }
            else{
                swap(arr,arr[i],i);
            }
        }
    }
    private static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
