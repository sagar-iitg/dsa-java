package com.sagar.array;

import java.util.Arrays;

public class FreCount {
    public static void main(String[] args) {


        String s="! abcab ";
        int[] count=new int[128];
        for(int i=0;i<s.length();i++){

            count[(int)s.charAt(i)]++;
        }
        System.out.println(Arrays.toString(count));
        System.out.println(count.length);
    }
}
