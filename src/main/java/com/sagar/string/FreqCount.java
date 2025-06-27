package com.sagar.string;

import java.util.Arrays;

public class FreqCount {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyza";
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            freq[(char)str.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(freq));
    }


}
