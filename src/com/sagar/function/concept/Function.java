package com.sagar.function.concept;

import java.util.Arrays;

public class Function {


    public static void main(String[] args) {
        sum(2,3,5);

    }
    static  void sum(int ...x){
        System.out.println(Arrays.toString(x));


    }
}
