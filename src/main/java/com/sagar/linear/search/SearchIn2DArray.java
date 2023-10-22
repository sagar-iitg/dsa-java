package com.sagar.linear.search;

public class SearchIn2DArray {


    public static void main(String[] args) {


        int[][] arr={{23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}};


        int target=34;
        boolean ans=searchIn2D(arr,target);
        System.out.println(ans);
    }

    private static boolean searchIn2D(int[][] arr, int target) {


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr [i][j]==target)
                {
                    System.out.println(i+" "+j);
                    return true;
                }

            }
        }
        return  false;
    }
}
