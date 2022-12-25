package com.sagar.leet.code;


public class LeetCode34 {


    public static void main(String[] args)
    {

            int[] arr={1,2,7,7,7,7,7,7,7,10};
            int target=7;
            int firstIndex= firstIndexBinarySearch(arr,target);
            System.out.println(firstIndex);
            int lastIndex=lastIndexBinarySearch(arr,target);
            System.out.println(lastIndex);


    }

    private static int lastIndexBinarySearch(int[] arr, int target) {


        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {

            int mid=start+(end-start)/2;



            if(arr[mid]==target)
            {
                start=mid+1;

            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;

            }

        }
        return end;
    }

    private static int firstIndexBinarySearch(int[] arr, int target) {

        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {

            int mid=start+(end-start)/2;



            if(arr[mid]==target)
            {
                end=mid-1;

            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;

            }

        }
        return start;
    }


}
