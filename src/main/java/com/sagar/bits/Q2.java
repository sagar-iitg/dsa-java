package com.sagar.bits;


import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String args[])throws IOException{

            System.out.println(setSetBit(44, 3, 1, 5));


    }

    static int setSetBit(int x, int y, int l, int r){

        // l and r must be between 1 to 32
        // (assuming ints are stored using
        //  32 bits)

        if (l < 1 || r > 32)
            return x;

        // Traverse in given range
        for (int i = l; i <= r; i++)
        {
            // Find a mask (A number whose
            // only set bit is at i'th position)
            int mask = 1 << (i-1);

            // If i'th bit is set in y, set i'th
            // bit in x also.
            if ((y & mask)!=0)
                x = x | mask;
        }

        return x;


    }


}
