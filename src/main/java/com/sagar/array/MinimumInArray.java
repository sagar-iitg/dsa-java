package com.sagar.array;

public class MinimumInArray {

    public static void main(String[] args) {
        int[] arr={7,1,5,0,6,4};
        int n=arr.length;
        int mini=arr[0];
        for(int i=0;i<n;i++)
        {

            System.out.print(i+"-"+mini);
            mini=Math.min(mini,arr[i]);
            System.out.println();
        }
    }
}
