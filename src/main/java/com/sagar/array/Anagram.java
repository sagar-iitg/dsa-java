package com.sagar.array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s="racecar";
        String t="carrace";

        boolean isAnagram = isAnagram(s, t);
        System.out.println(isAnagram);

    }

    private static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);

    }
}
