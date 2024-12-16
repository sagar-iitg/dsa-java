package com.sagar.bits;

public class BinaryNumberToString {

    public static void main(String[] args) {

        int n=0b1010;
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                binary.append("1");
            } else {
                binary.append("0");
            }
        }
        System.out.println(binary);
        System.out.println(binary.reverse());
    }
}
