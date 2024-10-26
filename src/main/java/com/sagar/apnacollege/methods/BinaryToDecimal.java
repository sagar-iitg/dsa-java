package com.sagar.apnacollege.methods;

import java.lang.Math;

public class BinaryToDecimal {

    public static void main(String[] args) {

        int n = 1000;
        System.out.println(solve(n));

    }

    static int solve(int n) {
        int pow = 0;
        int bin_no = 0;

        while (n > 0) {

            int last_digit = n % 10;
            bin_no = bin_no + last_digit * (int) Math.pow(2, pow);
            pow++;
            n = n / 10;

        }
        return bin_no;

    }

}
