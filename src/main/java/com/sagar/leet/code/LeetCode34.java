package com.sagar.leet.code;


public class LeetCode34 {


    public static void main(String[] args)
    {

            int[] arr={1,2,100,100};
            int target=100;
            int firstIndex= firstIndexBinarySearch(arr,target);
            System.out.println(firstIndex);
            int lastIndex=lastIndexBinarySearch(arr,target);
            System.out.println(lastIndex);


    }

    private static int lastIndexBinarySearch(int[] arr, int target) {


        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {

            int mid=start+(end-start)/2;



            if(arr[mid]==target)
            {
                ans=mid;
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
        return ans;
    }

    private static int firstIndexBinarySearch(int[] arr, int target) {


        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {

            int mid=start+(end-start)/2;



            if(arr[mid]==target)
            {
                ans=mid;
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
        return ans;
    }


}
