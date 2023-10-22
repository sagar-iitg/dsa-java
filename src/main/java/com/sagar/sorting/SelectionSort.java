package com.sagar.sorting;

public class SelectionSort implements Sorting{

    @Override
    public void sort(int[] arr)
    {


        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min_index=Utilities.findMinIndexInArray(arr,i,n-1);
            Utilities.swap(arr,i,min_index);
        }


    }



}
