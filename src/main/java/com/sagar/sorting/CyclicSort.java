package com.sagar.sorting;

import java.util.Arrays;

public class CyclicSort {


    public static void main(String[] args)
    {


        int[] arr={0,5,2,4,1,3,7,8,6};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort( int[] arr)
    {
        int i=0;


        while(i<arr.length)
        {

            if(arr[i]!=i)
            {
                Utilities.swap(arr,i,arr[i]);
                //i++;

            }
            else{
                i++;
            }
        }

    }
}
