package com.sagar.string;

import java.util.Arrays;

public class StringHash {
    public static void main(String[] args) {
        String ans=hash("sagar");
        System.out.println(ans);
    }
    static String hash(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(freq));
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                ans.append((char) (i+'a'));
                ans.append(freq[i]);
            }

        }
        return ans.toString();
    }
}
