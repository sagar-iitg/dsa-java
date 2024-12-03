package com.sagar.leet.code;


import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeString {

    // Encodes a list of strings to a single string
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            // Append the length of the string followed by a delimiter ":" and then the string itself
            encoded.append(s.length()).append(":").append(s);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings
    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // Find the index of the delimiter ":"
            int delimiterIndex = str.indexOf(":", i);
            // Get the length of the next string
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            // Extract the actual string using the length
            String word = str.substring(delimiterIndex + 1, delimiterIndex + 1 + length);
            // Add the string to the decoded list
            decoded.add(word);
            // Move the pointer to the next string's length
            i = delimiterIndex + 1 + length;
        }

        return decoded;
    }

    // Test examples
    public static void main(String[] args) {
        EncodeAndDecodeString solution = new EncodeAndDecodeString();

        // Example 1
        List<String> input1 = List.of("neet", "code", "love", "you");
        String encoded1 = solution.encode(input1);
        System.out.println(encoded1);
        List<String> decoded1 = solution.decode(encoded1);
        System.out.println("Encoded: " + encoded1);
        System.out.println("Decoded: " + decoded1);

        // Example 2
        List<String> input2 = List.of("we", "say", ":", "yes");
        String encoded2 = solution.encode(input2);
        List<String> decoded2 = solution.decode(encoded2);
        System.out.println("Encoded: " + encoded2);
        System.out.println("Decoded: " + decoded2);
    }
}

