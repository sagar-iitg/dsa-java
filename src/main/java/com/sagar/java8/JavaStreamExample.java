package com.sagar.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;
import java.util.*;



public class JavaStreamExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        Optional<String> longestWord = words.stream()
                .sorted((word1, word2) -> Integer.compare(word2.length(), word1.length())).findFirst();


        System.out.println(longestWord.get());


        List<String> names = Arrays.asList("dog","Alice", "Bob", "Charlie");
        String joinedNames = names.stream().collect(Collectors.joining(", "));
        System.out.println(joinedNames);
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(names);
        names.stream().sorted().forEach(System.out::println);


    }
}