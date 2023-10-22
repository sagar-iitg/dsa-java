package com.sagar.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] A={1,1};
        int[] B={2,2};
        int[] res=new int[2];
        res=fairCandySwap(A,B);
        System.out.println(Arrays.toString(res));


    }
    public static int[] fairCandySwap(int[] A, int[] B) {

        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum()) / 2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : A) S.add(a);
        for (int b : B) if (S.contains(b + dif)) return new int[] {b + dif, b};
        return new int[0];

    }
}
