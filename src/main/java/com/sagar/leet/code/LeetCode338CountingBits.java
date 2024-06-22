package com.sagar.leet.code;

import java.util.Arrays;

public class LeetCode338CountingBits {

    public static void main(String[] args) {

        int[] ans=countBits(2);
        System.out.println(Arrays.toString(ans));
    }
    public static  int[] countBits(int n) {
        int[] temp=new int[n+1];
        for(int i=0;i<=n;i++){
            temp[i]=countOnes(i);
        }
        return temp;
    }
    public static int countOnes(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;  // Check if the least significant bit is 1
            number >>>= 1;        // Shift the number right by 1 bit
        }
        return count;
    }
}
