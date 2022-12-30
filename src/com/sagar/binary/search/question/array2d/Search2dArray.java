package com.sagar.binary.search.question.array2d;

import java.util.Arrays;

public class Search2dArray
{


    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{4,5,6,122},{7,8,9}};
        int target=122;

        int[] x=search(arr,target);
        System.out.println(Arrays.toString(x));



    }

    private static int[] search(int[][] arr, int target)
    {

        int[] res=new int[2];
        boolean flag=false;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    flag=true;


                }

            }
            if(flag)
            {
                break;
            }
        }
        return  res;

    }
}
