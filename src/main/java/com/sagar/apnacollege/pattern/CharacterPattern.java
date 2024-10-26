package com.sagar.apnacollege.pattern;

public class CharacterPattern {

    public static void main(String[] args) {

        int n = 10;

        int ch = 65;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                char y = (char) ch;
                System.out.print(y);
                ch++;
            }
            System.out.println();

        }

    }

}
