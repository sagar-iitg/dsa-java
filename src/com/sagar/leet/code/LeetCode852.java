package com.sagar.leet.code;

public class LeetCode852 {


    public static void main(String[] args) {

        int arr[]={10,23,45,67,89,100,101,103,105,110,89,79,69,40,10,2,1,0};

        int ans=peakElement(arr);
        System.out.println(ans);


    }

    private static int peakElement(int[] arr)
    {

        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1])
            {
                end =mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
}
