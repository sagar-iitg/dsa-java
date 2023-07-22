package com.sagar.array;

import java.util.Arrays;

public class Leet442 {


    public static void main(String[] args) {
        //int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
        int arr[]={4,3,2,7,8,2,3,1};

        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % (arr.length)]
                    = arr[arr[i] % (arr.length)]
                    + (arr.length);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) {
                System.out.println(i + " ");
            }
        }
    }

}
