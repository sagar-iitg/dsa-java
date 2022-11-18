package com.sagar.function.concept;

import java.util.Scanner;

public class Array2D {


    public static void main(String[] args) {

        int[][] arr=new int[3][3];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
           // System.out.println("Enter no of cols");
            //int col= sc.nextInt();


            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
