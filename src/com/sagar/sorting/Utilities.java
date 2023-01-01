package com.sagar.sorting;

public class Utilities {

    static int findMinIndexInArray(int[] arr,int start,int end)
    {


        int min=arr[start];
        int index=start;

        for(int i=start;i<=end;i++)
        {

            if(arr[i]<min)
            {
                min=arr[i];
                index=i;

            }

        }
        return index;

    }
    static void swap(int[] arr, int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
