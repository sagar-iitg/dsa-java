package com.sagar.tryexponenet;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String document = "Just practice. Practice makes perfect. You'll get by just practice.";
        String[] tokens = document.split("\\s+");
        System.out.println(Arrays.toString(tokens));
        String word = "Hello, World 123!";
        String result = word.replaceAll("[^a-zA-Z]", "");
        System.out.println(result);


    }
}
