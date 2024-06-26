package com.sagar.string;

import java.util.Arrays;

public class SeniorMostPerson {
    public static void main(String[] args) {
        String input = "MK GANDHI-18691002,J Nehru-18891114,LB SHASTRI-19041002";
        String seniorMostPerson = getSeniorMostPerson(input);
        System.out.println("Senior most person: " + seniorMostPerson);
    }

    public static String getSeniorMostPerson(String input) {
        // Split the input string by commas to get each pair
        String[] pairs = input.split(",");
        System.out.println(Arrays.toString(pairs));

        String seniorMostPerson = "";
        String earliestDOB = "99999999"; // Initialize with a large number for comparison

        for (String pair : pairs) {
            // Split each pair by '-' to separate name and DOB
            String[] parts = pair.split("-");
            String name = parts[0];
            String dob = parts[1];

            // Compare DOB to find the earliest one
            if (dob.compareTo(earliestDOB) < 0) {
                earliestDOB = dob;
                seniorMostPerson = name;
            }
        }

        return seniorMostPerson;
    }
}
