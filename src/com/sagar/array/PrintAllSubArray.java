package com.sagar.array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubArray {


    public static void main(String[] args) {


        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        List<List<Integer>> ans=new ArrayList<>();

        solve(arr,ans);
        System.out.println(ans.size());
    }

    private static void solve(int[] arr,List<List<Integer>> ans) {

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i;j<arr.length;j++)
            {
                ArrayList<Integer> temp=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    temp.add(arr[k]);
                    System.out.print(arr[k]+" ");
                }
                System.out.println();


                ans.add(temp);
            }
            System.out.println("---");

        }

    }
}
