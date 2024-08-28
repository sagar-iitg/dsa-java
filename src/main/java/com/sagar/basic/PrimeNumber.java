package com.sagar.basic;

public class PrimeNumber {

    public static void main(String[] args) {


        System.out.println(getPrime(1));

    }

    private static boolean getPrime(int x) {
        if(x==1) return false;
        for(int i=2;i<x;i++){
            if(x%i==0) return false;
        }
        return true;

    }
}
