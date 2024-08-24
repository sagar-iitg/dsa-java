package com.sagar.interviews.practice3;

public class Example {

    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int n=arr.length;
        int x=7;
        int start=0;
        int end=0;
        int j=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(end<n){

                sum=sum+arr[end];
                end++;

            while(sum>=x) {
                ans=Math.min(ans,end-start);
                sum=sum-arr[start];
                start++;
            }

        }
        System.out.println(ans);
    }
}