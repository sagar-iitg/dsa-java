package com.sagar.array;

public class HCF {
    public static void main(String[] args) {

        int ans=gcd(10,20);
        System.out.println(ans);
    }

    private static int gcd(int a, int b) {
            if(b==0) return a;

            return gcd(b,a%b);
    }
}
