package com.sagar.array;

class Solution {

    public static void main(String[] args) {


        int arr[]={-2,0,-1};


        int ans=solve(arr);
        System.out.println(ans);
    }
    public static  int solve(int[] nums) {
        
        int min=nums[0];
        int minIndex=0;

        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]<min)
           {
               min=nums[i];
               minIndex=i;

           }
           
        }
        System.out.println(minIndex);
        int prefixProduct=1;
        int suffixProduct=1;

        for(int i=0;i<minIndex;i++)
        {
           
                   prefixProduct*=nums[i];
            

        }

        for(int i=minIndex;i<nums.length;i++)
        {
           
                   suffixProduct*=nums[i];
            

        }
        return Math.max(suffixProduct,prefixProduct);




    }
}