package com.sagar.sorting;

import java.util.Arrays;

public class Client {


    public static void main(String[] args) {

        int[] arr={10,2,34,98,0,-99,100,34};
        System.out.println(Arrays.toString(arr));
        new SelectionSort().sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
