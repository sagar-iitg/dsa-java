package com.sagar.array;


public class SubArrayUsingRecursion1 {

    public static void main(String[] args) {

        int[] arr={1,2,3};
        int i=0;
        int j=0;
        solve(0,0,arr);
    }
    private static void  solve(int i,int j,int arr[]){


        if(i==arr.length-1 && j==arr.length-1)
        {
            System.out.println(arr[i]);
            System.exit(1);
        }
        if(i==arr.length)
            return;

        if(j==arr.length)
        {
            int temp=i+1;
            solve(i+1,temp,arr);
        }
        for(int k=i;k<=j;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        solve(i,j+1,arr);


    }
}
