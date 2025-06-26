package com.sagar.gs;
/* Problem Name is &&& Longest Uniform Substring &&& PLEASE DO NOT REMOVE THIS LINE. */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Instructions to candidate.
 *  1) Run this code in the REPL to observe its behaviour. The
 *     execution entry point is main().
 *  2) Your task is to implement the following method ('longestUniformSubstring')
 *
 *  This method should return an integer array with two elements that correctly identifies the location of the longest
 *  uniform substring within the input string. The first element of the array should be the starting index of the longest
 *  substring and the second element should be the length.
 *
 *  e.g.
 *
 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
 *
 *  3) If time permits, add some additional test cases.
 *
 *   max=0;
 *   count=1;//3
 *
 *
 * max=3
 * count=2;
 * count=1
 *
 *
 *   abbbccdabbcccc
 */

public class LongestUnifromSubString {
    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();
    static int[] longestUniformSubstring(String input){
        // todo: implement the longestUniformSubstring logic
        int startIndex=-1;
        int maxLen=0;
        int count=1;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
                if(maxLen<count){
                    maxLen=count;
                    startIndex=i-maxLen+1;
                }
            }else{
                count=1;
            }

        }


        return new int[]{ startIndex, maxLen };
    }

    public static void main(String[] args) {
          testCases.put("", new int[]{-1, 0});
           testCases.put("10000111", new int[]{1, 4});
          testCases.put("aabbbbbCdAA", new int[]{2, 5});
          testCases.put("aabbbbb", new int[]{2, 5});
        testCases.put("1000011010101110110100010010011111111", new int[]{29, 8});

        // todo: implement more tests, please
        // feel free to make testing more elegant

        boolean pass = true;
        for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if(pass){
            System.out.println("All tests pass!");
        } else {
            System.out.println("At least one failure! :( ");
        }
    }
}
