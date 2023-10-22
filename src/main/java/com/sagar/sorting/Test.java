package com.sagar.sorting;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {



        int[] arr={-5,1,2,0,-88};

        System.out.println(Arrays.toString(arr));

        //Utilities.swap(arr,0,1);

        //System.out.println(Arrays.toString(arr));
        System.out.println(Utilities.findMinIndexInArray(arr,0,4));


    }
}
