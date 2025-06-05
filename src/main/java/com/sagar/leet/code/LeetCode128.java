package com.sagar.leet.code;


public class LeetCode128 {
    public static int longestConsecutive(int[] nums) {

        int count=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            count=1;
            int ele=nums[i];
            while(linearSearch(ele+1,nums)==true){
                ele=ele+1;
                count++;
            }
            ans=Math.max(ans,count);
        }

        return ans;
    }

    public static boolean linearSearch(int target,int[] arr){

        for(int i=0;i<arr.length;i++){
            if(target==arr[i]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={};
        int result=longestConsecutive(arr);
        System.out.println(result);

    }
}
