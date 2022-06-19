package com.sagar.recursion;

public class PrintNumbers {


    public static void main(String[] args) {
            fun(5);
    }

    private static void  fun(int i) {
        if(i==0)
            return;

        fun(i-1);
        System.out.println(i);
    }
}
