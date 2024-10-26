package com.sagar.apnacollege.methods;

import java.io.*;

public class DecimalToOctal {

    public static void main(String[] args) throws Exception {

        File file = new File("./methods/input.txt");

        // Note: Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class

        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable

        String st;

        // Condition holds true till
        // there is character in a string

        while ((st = br.readLine()) != null) {
            // Print the string
            System.out.println(Integer.toOctalString(Integer.parseInt(st)));

            solve(Integer.parseInt(st));

        }
        br.close();

    }

    private static void solve(int n) {

        int oct_no = 0;
        int pow = 0;

        while (n > 0) {

            int rem = n % 8;
            oct_no = oct_no + rem * (int) Math.pow(10, pow);
            pow++;
            n = n / 8;
        }
        System.out.println(oct_no);
    }

}
