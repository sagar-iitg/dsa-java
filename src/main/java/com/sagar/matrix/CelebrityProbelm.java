package com.sagar.matrix;

import java.util.ArrayDeque;
import java.util.Deque;

public class CelebrityProbelm {
    public static void main(String[] args) {

        int[][] matrix = { { 0, 0, 1, 0 },
                            { 0, 0, 1, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 1, 0 } };

        int result = findCelebrity(matrix,matrix.length);
        System.out.println(result);


    }

    private static int findCelebrity(int[][] matrix, int n) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            stack.push(i);
        }

        while(stack.size()>1){

            int a= stack.pop();
            int b=stack.pop();
            if(knows(matrix,a,b))
            {
                stack.push(b);
            }else{
                stack.push(a);
            }

        }

        int ans=stack.pop();

        int zeroCount=0;
        for(int i=0;i<n;i++){
            if(matrix[ans][i]==0){
                zeroCount++;
            }
        }
        if(zeroCount!=n) return -1;

        int colCount=0;

        for(int i=0;i<n;i++){
            if(matrix[i][ans]==1) colCount++;
        }
        if(colCount!=n-1) return -1;
        return  ans;

    }

    private static boolean knows(int[][] matrix, int a, int b) {

        if(matrix[a][b]==1) return true;
        return false;
    }
}
