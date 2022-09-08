package com.sagar.function.concept;

import java.util.Arrays;

public class ArrayExample {


    public static void main(String[] args) {
        String[] arr={"Hello","Sagar","kumar"};
        System.out.println(Arrays.toString(arr));
        change(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void change(String[] a){
        a[0]="Hi";
    }
}
