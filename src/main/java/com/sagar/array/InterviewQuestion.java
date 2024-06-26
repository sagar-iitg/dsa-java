package com.sagar.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterviewQuestion {
    public static void main(String[] args) {

        int[] arr={-1,5,0,10};
        int target=5;
        solve(arr,target);
    }
    private static void  solve(int[] arr,int target){


        int[] ans={-1,-1};
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

           if(map.containsKey(target-arr[i])){
               ans[0]=i;
               ans[1]=map.get(target-arr[i]);
               break;
           }else{
               map.put(arr[i],i);
           }


        }
       // System.out.println(map);
        System.out.println(Arrays.toString(ans));



    }


}
