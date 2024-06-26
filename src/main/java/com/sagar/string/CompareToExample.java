package com.sagar.string;

public class CompareToExample {
    public static void main(String[] args) {
        String date1 = "20200101";
        String date2 = "20200201";
        
        // Compare date1 and date2
        int result = date1.compareTo(date2);
        
        if (result < 0) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (result > 0) {
            System.out.println(date1 + " is later than " + date2);
        } else {
            System.out.println(date1 + " is the same as " + date2);
        }
    }
}
