package com.sagar.array;

import java.util.Arrays;

public class Two2DArray {
    public static void main(String[] args) {

        int arr[][]=new int[2][3];
        for(int i=0;i<arr.length;i++)
        {
            Arrays.fill(arr[i],-1);
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
