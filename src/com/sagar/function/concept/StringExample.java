package com.sagar.function.concept;


//string is immutable
//primitve datatypes
//array, string,

public class StringExample {


    public static void main(String[] args) {

        String str="hello";
        System.out.println(str);
        change(str);
        System.out.println(str);

    }

    static void change(String str){
        str="Nitish";


    }


}
