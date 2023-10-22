package com.sagar.freq;

import java.util.Arrays;

public class CharacterCount {

    public static void main(String[] args) {

        String p="bcd";
        int[] phash=new int[26];
        for(int i=0;i<p.length();i++)
        {
            phash[p.charAt(i)-97]++;
        }
       // Arrays.stream(phash).forEach(System.out::println);
        System.out.println(Arrays.toString(phash));


    }
}
