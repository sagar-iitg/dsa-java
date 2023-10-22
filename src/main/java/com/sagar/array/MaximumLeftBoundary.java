package com.sagar.array;

import java.util.Arrays;

public class MaximumLeftBoundary {

    public static void main(String[] args) {

        int arr[]={4,2,0,6,3,2,5};

        solve(arr);
    }

    private static void solve(int[] arr) {


        int left[]=new int[arr.length];
        left[0]=arr[0];
        int right[]=new int[arr.length];
        right[arr.length-1]=arr[arr.length-1];


        for(int i=1;i<arr.length;i++)
        {
            left[i]=Math.max(arr[i],left[i-1]);

        }
        for(int i= arr.length-2;i>=0;i--)
        {
            right[i]=Math.max(arr[i],right[i+1]);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
}
