package com.sagar.leet.code;

import java.util.Arrays;

public class LeetCode242 {

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        int[] count=new int[256];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }

        for(int ele:count){
            if(ele!=0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";


        System.out.println(isAnagram(s,t));
        check("abc");

    }

    private static void check(String s) {
        int[] count=new int[256];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(count));
    }


}
