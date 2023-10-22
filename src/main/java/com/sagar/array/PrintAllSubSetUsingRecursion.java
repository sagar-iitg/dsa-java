package com.sagar.array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSetUsingRecursion {


    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();

        solve(arr,new ArrayList<Integer>(),ans,0);
        System.out.println(ans);
    }

    private static void solve(int[] arr, ArrayList<Integer> output,List<List<Integer>> ans,int index) {
        if(index==arr.length)
        {

            ans.add(new ArrayList<>(output));
            return;
        }


        solve(arr,output,ans,index+1);
        output.add(arr[index]);
        solve(arr,output,ans,index+1);
        output.remove(output.size()-1);



    }
}
