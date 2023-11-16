package com.sagar.leet.code;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode1980 {


    public static void main(String[] args) {
        String[] nums={"01","11"};
        Set<Integer> integers = new HashSet<>();
        for (String num : nums) {
            integers.add(Integer.valueOf(num, 2));
        }
        System.out.println(integers);

        Set<String> in = new HashSet<>(Arrays.asList(nums));
        System.out.println(in);

    }
}
