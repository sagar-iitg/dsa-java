package com.sagar.apnacollege.methods;

public class DecimaltoBinary {

    public static void main(String[] args) {

        int n = 100;
        System.out.println(Integer.toBinaryString(n));
        solve(n);

    }

    // 101
    //
    static void solve(int n) {
        int pow = 0;
        int dec_no = 0;
        // ArrayList<Integer> dec = new ArrayList<>();

        while (n > 0) {

            int rem = n % 2;
            // dec.add(rem);
            dec_no = dec_no + rem * (int) Math.pow(10, pow);
            n = n / 2;
            pow++;

        }

        System.out.println(dec_no);
        // Collections.reverse(dec);
        // for (Integer i : dec) {

        // System.out.print(i);
        // }

    }
}
