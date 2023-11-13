package com.sagar.apnacollege.basics;

public class Ternary {

    public static void main(String[] args) {

        int a = 12;
        int b = 11;
        int c = 13;

        // ternary operator
        int large = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(large);

    }

}
