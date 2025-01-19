package com.sagar.bits;

    public class ReverseBits {
        public static int reverseBits(int n) {
            int res = 0;
            for (int i = 0; i < 32; i++) {
                int bit = (n >> i) & 1;
                res += (bit << (31 - i));
            }
            return res;
        }

        public static void main(String[] args) {
           // 00000000000000000000000000010101
            //00000000000000000000000000010101

            int ans=ReverseBits.reverseBits(0b00000000000000000000000000010101);
            System.out.println(ans);
            // Interpret as unsigned and display the unsigned result
            long unsignedResult = Integer.toUnsignedLong(ans);
            System.out.println(unsignedResult); // Correct unsigned output

        }
    }