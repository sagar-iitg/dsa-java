package com.sagar.array;

public class IndexofMinimumInArray {

    public static void main(String[] args) {
        int[] a = { -2,  4, -1, -2, 1, 5, -3 };
        int res=solve(a);
        System.out.println(res);
    }

    private static int solve(int[] nums) {

        int min=nums[0];
        int minIndex=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                minIndex=i;

            }

        }
        return minIndex;

    }


}
