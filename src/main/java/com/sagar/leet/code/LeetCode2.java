package com.sagar.leet.code;

import java.util.*;

class LeetCode2 {

    private static class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        public String toString(){
            return x+" "+y;
        }
    }
    public static int[] twoSum(int[] nums, int target) {

        List<Pair> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(new Pair(nums[i],i));
        }

        Comparator<Pair> comp=(a, b)->Integer.compare(a.x,b.x);

        Collections.sort(list,comp);
       // System.out.println(list);

        int start=0;
        int end=list.size()-1;

        while(start<end){

            int sum=list.get(start).x+list.get(end).x;
            // System.out.println(sum+" "+start+" "+end);
            if(sum==target){
                return new int[]{list.get(start).y,list.get(end).y};
            }
            else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};



    }

    public static void main(String[] args) {
        int[] arr={3,2,3};
        int target=6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}