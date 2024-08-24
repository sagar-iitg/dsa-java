package com.sagar.interviews.practice3;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagram2 {

    public static void main(String[] args) {

        String[] words={"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> res = Arrays.stream(words)
                .collect(Collectors.groupingBy(

                        word -> {
                            char[] ch = word.toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
                        },
                        Collectors.toList()

                ));


        System.out.println(res);

    }



}
