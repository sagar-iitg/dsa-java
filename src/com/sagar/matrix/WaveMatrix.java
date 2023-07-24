package com.sagar.matrix;

import java.util.Arrays;

public class WaveMatrix {


    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.deepToString(arr));
        solve(arr);
    }

    private static void solve(int[][] arr) {

        int m=arr.length;
        int n=arr[0].length;

        for(int col=0;col<n;col++)
        {
            //even no column print top to bottom
            if( (col&1)==0)
            {
                for(int i=0;i<m;i++)
                {
                    System.out.print(arr[i][col]+" ");
                }
            }
            else{

                //odd no of column bottom to top
                for(int i=m-1;i>=0;i--)
                {
                    System.out.print(arr[i][col]+" ");
                }

            }
        }
    }
}
