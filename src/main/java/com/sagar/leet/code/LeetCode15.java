package com.sagar.leet.code;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class LeetCode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                }
                else if(sum>0)
                {
                    k--;
                }
                else{
                    j++;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums ={-1,0,1,2,-1,-4};
        List<List<Integer>> res=threeSum(nums);
        System.out.println(res);
    }
}
