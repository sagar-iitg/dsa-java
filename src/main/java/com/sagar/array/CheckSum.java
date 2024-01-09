package com.sagar.array;

import java.util.ArrayList;
import java.util.List;

public class CheckSum {

    public static void main(String[] args) {

        int[] arr={2,50,155,3,10,200,30,1,255,2,256,1};
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();

        int i=0;
        while(i<n)
        {
            int ele=arr[i];
            int sum=0;

            for(int j=i+1;j<i+1+ele;j++)
            {
                sum+=arr[j];
            }
            ans.add(sum%256);

            i=i+ele+1;


        }
        System.out.println(ans);


    }
}
