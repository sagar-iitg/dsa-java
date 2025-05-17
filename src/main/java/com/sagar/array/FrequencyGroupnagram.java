package com.sagar.array;

import java.util.Arrays;

public class FrequencyGroupnagram {


    public static void main(String[] args) {

        char[] ch={'a','b','c','a','z','b'};//a2b2c1z1

        String ans=solve(ch);
        System.out.println(ans);
    }
    private static String solve(char[] ch){

        int[] freq=new int[26];

        for(char c:ch){
            freq[c-'a']++;
        }
        System.out.println(Arrays.toString(freq));

        StringBuilder result=new StringBuilder();
        for(int i=0;i<=25;i++){
           // if(freq[i]!=0)
                result.append((char) (i+'a')).append(freq[i]);
        }
        System.out.println(result);
        return result.toString();

    }
}
