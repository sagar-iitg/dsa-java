package com.sagar.apnacollege.methods;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(10));

    }

    static int fact(int x) {

        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }

        return f;

    }

}
