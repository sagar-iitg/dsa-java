package com.sagar.math;

import java.util.Arrays;

public class FrequenciesOfLimitedRangeArray {


    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 5};
        System.out.println(Arrays.toString(arr));
        method2(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void method1(int[] arr) {
        int n= arr.length;
        int[] hash=new int[n];
        Arrays.fill(hash,0);
        int i=0;
        while(i<n)
        {
            hash[arr[i]-1]++;
            i++;

        }
        //System.out.println(Arrays.toString(hash));
        for(i = 0; i < n; i++)
        {
            System.out.println((i + 1) + " -> " +
                    hash[i]);
        }







    }


    private static void method2(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]<=0)
            {
                i++;
                continue;

            }
            int e=arr[i]-1;

                if(arr[e]>0)
                {
                    arr[i]=arr[e];
                    arr[e]=-1;

                }
                else{
                    arr[e]--;
                    arr[i]=0;
                    i++;

                }
        }
        System.out.println("Below are counts of all elements");
        for (int j = 0; j < n; j++)
            System.out.println(j+1 + "->" + Math.abs(arr[j]));

    }

}
