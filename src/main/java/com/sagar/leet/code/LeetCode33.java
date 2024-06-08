package com.sagar.leet.code;


class LeetCode33{

    public static void main(String[] args) {
       int[] nums={4,5,6,7,0,1,2};
       int target=72;
       int res=search(nums,target);
        System.out.println(res);
    }
    public static int search(int[] nums, int target) {
        // Your code goes here
        int ans=helper(nums,target,0,nums.length-1);
        return ans;
    }

    public static int helper(int[] arr,int target,int start,int end){


        if(start>end) return -1;
        int mid=(start+end)>>>1;
        if(arr[mid]==target) return mid;
        //first half is sorted
        if(arr[mid]>arr[start]){

            if(arr[start]<=target &&  arr[mid]>target){
                return helper(arr,target,start,mid-1);
            }
            else{
                return helper(arr,target,mid+1,end);
            }
        }
        //second half is sorted
        else{
            if(arr[mid]<target && arr[end]>=target){
                return  helper(arr,target,mid+1,end);
            } else{
               return helper(arr,target,start,mid-1);
            }
        }
       // return -1;
    }
}
