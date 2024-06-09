package com.sagar.array;

import java.util.Arrays;

public class MoveNegativeEnd {

    public static void main(String[] args) {

        int[] arr={1,-1,3,2,-7,-5,11,6};
        int n=arr.length;
        int[] temp=new int[n];

        int i=0;

        for(int k=0;k<n;k++){
            if(arr[k]>0){
                temp[i]=arr[k];
                i++;
            }
        }

        for(int k=0;k<n;k++){
            if(arr[k]<=0){
                temp[i]=arr[k];
                i++;
            }
        }

        for(int k=0;k<n;k++) arr[k]=temp[k];
        System.out.println(Arrays.toString(arr));
    }
}
