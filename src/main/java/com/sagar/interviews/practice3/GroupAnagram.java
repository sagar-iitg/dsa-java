package com.sagar.interviews.practice3;

import java.util.Arrays;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] strs={"eat","tea","tan","ate","nat","bat"};
        String res=getSignature("ate");
        System.out.println(res);


    }
    public static String getSignature(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        System.out.println(Arrays.toString(count));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                sb.append((char) ('a' + i));
                sb.append(count[i]);
            }
        }
        return sb.toString();
    }

}
