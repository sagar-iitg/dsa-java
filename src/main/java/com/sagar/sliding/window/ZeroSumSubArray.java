package com.sagar.sliding.window;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {

    public static void main(String[] args) {
        long[] arr={0,0,5,5,0,0};
        int n=arr.length;
        long result=findSubarray(arr,n);
        System.out.println(result);

    }
    public static long findSubarray(long[] arr ,int n)
    {
        //Your code here
        Map<Long,Long> map=new HashMap<>();
        map.put(0L,1L);
        long prefixSum=0;
        long count=0;
        for(int i=0;i<arr.length;i++){
            prefixSum= prefixSum+arr[i];
            if(map.containsKey(prefixSum)){
                count=count+map.get(prefixSum);
                map.put(prefixSum,map.get(prefixSum)+1);
            }else{
                map.put(prefixSum,1L);
            }
        }
        return count;
    }
}
