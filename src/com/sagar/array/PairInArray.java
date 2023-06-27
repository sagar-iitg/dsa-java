package com.sagar.array;

public class PairInArray {


    public static void main(String[] args) {

        int arr[]={2,4,6,8,10};
        solve(arr);
    }

    private static void solve(int[] arr) {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
