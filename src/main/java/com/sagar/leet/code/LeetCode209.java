package com.sagar.leet.code;

public class LeetCode209 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int target=11;
       int ans= minSubArrayLen(target,nums);
        System.out.println(ans);
    }
    public static int minSubArrayLen(int target, int[] nums) {

        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        boolean flag=false;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum>=target){
                    flag=true;
                    ans=Math.min(ans,j-i+1);
                }

            }
        }
        if(flag==false) return 0;
        return ans;
    }
}
