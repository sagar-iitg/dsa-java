package com.sagar.sort;

import java.util.Arrays;

public class CyclicSort2 {

    public static void main(String[] args) {

        int[] arr={5,7,1,6,2,8,3,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {

        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==(i+1)){
                i++;
                continue;
            }
            else{
                swap(arr,arr[i]-1,i);
            }
        }
    }
    private static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
