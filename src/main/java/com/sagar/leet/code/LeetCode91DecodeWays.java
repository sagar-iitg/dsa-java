package com.sagar.leet.code;

import java.util.ArrayList;
import java.util.List;

public class LeetCode91DecodeWays {

    public static void main(String[] args) {
        String str="06";
        //BZ
        //VF
        List<String> ans=new ArrayList<>();
        recursiveDecode(str,0,ans,new StringBuilder());
        System.out.println(ans);

    }
    private static void recursiveDecode(String s,int index,List<String> ans,StringBuilder temp){

        if(index==s.length()) {
            ans.add(temp.toString());
            return;
        }

        if(s.charAt(index)=='0') return;

        int singleDigitValue=Character.getNumericValue(s.charAt(index));
        char singleDigitChar=(char) (singleDigitValue-1+'A');
        temp.append(singleDigitChar);
        recursiveDecode(s,index+1,ans,temp);
        temp.deleteCharAt(temp.length() - 1); // backtrack



        if(index+1<s.length()){
            int twoDigitValue = Integer.parseInt(s.substring(index, index + 2));
            if(twoDigitValue<=26){
                char twoDigitChar = (char) ('A' + twoDigitValue - 1);
                temp.append(twoDigitChar);
                recursiveDecode(s,index+2,ans,temp);
                temp.deleteCharAt(temp.length()-1);
            }


        }
        //return ways;
    }
}
