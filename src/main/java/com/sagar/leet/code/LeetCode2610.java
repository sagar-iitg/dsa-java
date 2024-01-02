package com.sagar.leet.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode2610 {
    public static void main(String[] args) {
        int[] nums={1,3,4,1,2,3,1};
        List<List<Integer>> matrix = findMatrix(nums);
        System.out.println(matrix);
    }

    public static List<List<Integer>> findMatrix(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);

            }
            else{
                map.put(nums[i],1 );
            }
        }
        System.out.println(map);

        int x=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            int values=i.getValue();
            x=Math.max(x,values);

        }
        System.out.println(x);
        List<List<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < x; i++) {
            ans.add(new ArrayList<>());
        }
        System.out.println(ans);

        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            int values=i.getValue()-1;
            while(values>=0){
                ans.get(values).add(i.getKey());
                values--;
            }

        }

        return ans;
    }
}
