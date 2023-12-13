package com.sagar.leet.code;

class LeetCode1582{


    public static void main(String[] args) {
        int[][] mat={{1,0,0},
                  {0,0,1},
                  {1,0,0}};
        //System.out.println(Arrays.deepToString(mat));
        System.out.println(numSpecial(mat));
        //System.out.println(Arrays.deepToString(mat));

    }
    public static int numSpecial(int[][] mat) {


        int[] rowArray=new int[mat.length];
        int[] colArray=new int[mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)
                {
                    rowArray[i]++;
                    colArray[j]++;
                }
            }
        }
       // System.out.println(Arrays.toString(rowArray));
        //System.out.println(Arrays.toString(colArray));
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1 && rowArray[i]==1 && colArray[j]==1)
                {
                     count++;
                }
                {

                }
            }
        }
        return count;

    }
}