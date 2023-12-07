package com.sagar.leet.code;

class Solution {


    public static void main(String[] args) {
        String[] strs={"flight","flow","flkfkkf"};
        longestCommonPrefix(strs);
    }
    public static String lcpUtil(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        String result="";
          // Compare str1 and str2 
        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result += str1.charAt(i);
        }
        return result;
        
        
    }
    
    
    public static String longestCommonPrefix(String[] strs) {
        
        
    
        String prefix=strs[0];
        
        for(int i=1;i<strs.length;i++){
            
            prefix=lcpUtil(prefix,strs[i]);
        }
        
        return prefix;
        
    }
}