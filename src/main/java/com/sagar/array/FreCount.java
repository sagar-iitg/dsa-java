package com.sagar.array;

import java.util.Arrays;

public class FreCount {
    public static void main(String[] args) {


        String s="abcab";
        int[] count=new int[26];


        for(int i=0;i<s.length();i++){

            count[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(count));
    }
}
