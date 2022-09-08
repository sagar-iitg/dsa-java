package com.sagar.function.concept;

import java.util.Arrays;

public class VarArgs {


    public static void main(String[] args) {


        multiple(2,3,"hello","sagar");
    }

    static  void multiple(int a,int b,String ...v)
    {
        System.out.println(Arrays.toString(v));


    }
}
