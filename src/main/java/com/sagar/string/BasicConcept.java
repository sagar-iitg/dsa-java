package com.sagar.string;

public class BasicConcept {

    public static void main(String[] args) {
        String str="check";
        String result="";
        result=str;
        System.out.println(result);
        System.out.println(str.substring(2,2).isBlank());
        System.out.println(str.substring(2,2).isEmpty());
    }
}
