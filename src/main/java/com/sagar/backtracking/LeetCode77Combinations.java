package com.sagar.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77Combinations {


    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        solve(ans,1,n,k,output);
        return ans;
    }
    private static void solve(List<List<Integer>> ans,int start,int n,int k,List<Integer> output){


        if(output.size()==k){
            ans.add(new ArrayList<>(output));
            return;
        }

        for(int i=start;i<=n;i++){
            output.add(i);
            solve(ans,i+1,n,k,output);
            output.remove(output.size()-1);//backtrack
        }

    }
}
