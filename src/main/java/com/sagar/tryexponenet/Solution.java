package com.sagar.tryexponenet;

import java.util.*;
import java.util.regex.*;

class Solution {

    // Helper function to clean and normalize words
    private static String cleanWord(String word) {
        return word.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    static String[][] wordCountEngine(String document) {
        // Map to keep track of word counts
        Map<String, Integer> wordMap = new LinkedHashMap<>();
        // List to maintain the order of words as they appear
        List<String> words = new ArrayList<>();

        // Split the document into words based on whitespace
        String[] tokens = document.split("\\s+");
        for (String token : tokens) {
            String cleanedWord = cleanWord(token);
            if (!cleanedWord.isEmpty()) {
                // Add to the list and update count in the map
                if (!wordMap.containsKey(cleanedWord)) {
                    words.add(cleanedWord);
                }
                wordMap.put(cleanedWord, wordMap.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        // Create a list of entries and sort it
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordMap.entrySet());
        entryList.sort((a, b) -> {
            int freqCompare = Integer.compare(b.getValue(), a.getValue());
            if (freqCompare == 0) {
                return Integer.compare(words.indexOf(a.getKey()), words.indexOf(b.getKey()));
            }
            return freqCompare;
        });

        // Prepare the result in the required format
        String[][] result = new String[entryList.size()][2];
        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            result[i][0] = entry.getKey();
            result[i][1] = String.valueOf(entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        String document = "Just practice. Practice makes perfect. You'll get by just practice.";

        String[][] result = wordCountEngine(document);

        for (String[] pair : result) {
            System.out.println("[ " + pair[0] + ", " + pair[1] + " ]");
        }
    }
}