package com.sagar.leet.code;

import java.util.Arrays;

class LeetCode48 {
    public static void rotate(int[][] matrix) {
        int n=matrix.length;


        //transpose the matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                swap(matrix,i,j);

            }
        }
    }

    public static void swap(int[][] matrix,int i,int j)
    {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}