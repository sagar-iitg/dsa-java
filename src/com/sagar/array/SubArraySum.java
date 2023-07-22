package com.sagar.array;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

    public static void main(String[] args) {



        int arr[]={-2,-3,4,-1,-2,1,5,-3};


        int ans=solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {


        int max_sum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int curr_sum=0;
            for(int j=i;j<arr.length;j++)
            {
                curr_sum=curr_sum+arr[i];
                max_sum=Math.max(curr_sum,max_sum);
            }
        }
        return max_sum;
    }
}
