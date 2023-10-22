package com.sagar.sorting;


public class BubbleSort implements  Sorting{
    @Override
    public void sort(int[] arr) {

        boolean flag;

        for(int i=0;i< arr.length;i++) {
            flag=false;
            for(int j=1;j<arr.length-i-1;j++) {
                if(arr[j]<arr[j-1]) {
                    flag=true;
                    Utilities.swap(arr,j,j-1);
                }
            }
            if(!flag)
                break;
        }
    }
}
