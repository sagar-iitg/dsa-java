package com.sagar.string;

import java.util.ArrayList;
import java.util.List;

public class RabinKarpAlgo {
   public static List<Integer> rabinKarp(String text, String pattern) {
        final int p = 31;
        final int m = (int) 1e9 + 9;
        int S = text.length(), T = pattern.length();

        List<Long> pPow = new ArrayList<>(Math.max(S, T));
        pPow.add(1L);
        for (int i = 1; i < Math.max(S, T); i++)
            pPow.add(pPow.get(i - 1) * p % m);

        List<Long> h = new ArrayList<>(T + 1);
        h.add(0L);
        for (int i = 0; i < T; i++)
            h.add((h.get(i) + (pattern.charAt(i) - 'a' + 1) * pPow.get(i)) % m);
        long hS = 0;
        for (int i = 0; i < S; i++)
            hS = (hS + (text.charAt(i) - 'a' + 1) * pPow.get(i)) % m;

        List<Integer> occurrences = new ArrayList<>();
        for (int i = 0; i + S - 1 < T; i++) {
            long curH = (h.get(i + S) + m - h.get(i)) % m;
            if (curH == hS * pPow.get(i) % m)
                occurrences.add(i);
        }
        return occurrences;
    }

    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";

        List<Integer> result = rabinKarp(pat, txt);

        System.out.println("Pattern found at indices: " + result);
    }
}
