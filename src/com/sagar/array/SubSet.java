package com.sagar.array;

import java.util.ArrayList;
import java.util.List;

public class SubSet {


    public static void main(String[] args) {

        int[] nums={1,2,3};

        List<List<Integer>> ans=new
                ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(nums,ans,temp,0);
        System.out.println(ans);


    }



    static void solve(int[] nums, List<List<Integer>> result,List<Integer> temp, int index)
    {

        if(index==nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;

        }





        //include
        temp.add(nums[index]);
        solve(nums,result,temp,index+1);
        //backtrack
        temp.remove(temp.size()-1);
        //exclude
        solve(nums,result,temp,index+1);



    }
}
