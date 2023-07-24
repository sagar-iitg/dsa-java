package com.sagar.sliding.window;

public class MaximumSumSubArray {


    public static void main(String[] args) {
        int arr[]={100, 200, 300, 400};
        int k=2;
        int ans=solve(arr,k);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int k) {

        int start=0;
        int end=0;
        int sum=0;
        int max=Integer.MIN_VALUE;

        while(end<arr.length)
        {
            sum=sum+arr[end];
            if(end-start+1<k)
            {
                end++;
            }
            else if(end-start+1==k)
            {

                //calculation
                max=Math.max(sum,max);
                sum=sum-arr[start];

                //slide the window

                start++;
                end++;



            }

        }


        return max;

    }
}
