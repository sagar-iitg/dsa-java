package com.sagar.string;

import java.util.ArrayList;
import java.util.List;

public class RabinKarp {
    public static List<Integer> rabinKarp(String text, String pattern) {
        int textLen = text.length();
        int patternLen = pattern.length();
        int patternHash = pattern.hashCode();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= textLen - patternLen; i++) {
            if (text.substring(i, i + patternLen).hashCode() == patternHash) {
                if (text.substring(i, i + patternLen).equals(pattern)) {
                    result.add(i);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "abracadabra";
        String pattern = "cad";
        List<Integer> indices = rabinKarp(text, pattern);
        System.out.println("Pattern found at indices: " + indices);
    }
}
