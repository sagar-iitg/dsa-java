package com.sagar.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroMatrix {

    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][]ans=setZeroMatrix(matrix);
        System.out.println(Arrays.deepToString(ans));

    }

    private static int[][] setZeroMatrix(int[][] matrix) {

        //space
        List<List<Integer>> zeroInMatrix=new ArrayList<>();

        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    zeroInMatrix.add(List.of(i,j));
                }
            }
        }
        System.out.println(zeroInMatrix);

        for(int i=0;i<zeroInMatrix.size();i++){
            int r=zeroInMatrix.get(i).get(0);
            for(int k=0;k<col;k++){
                matrix[r][k]=0;
            }
            int c=zeroInMatrix.get(i).get(1);
            for(int p=0;p<row;p++){
                matrix[p][c]=0;
            }

        }
        return matrix;
    }
}
