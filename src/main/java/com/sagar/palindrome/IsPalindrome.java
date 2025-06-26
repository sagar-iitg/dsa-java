package com.sagar.palindrome;

public class IsPalindrome {

    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str,0,str.length()-1));
    }

    static boolean isPalindrome(String s,int i,int j){
        if(i>j){
            return true;
        }

        if(s.charAt(i)==s.charAt(j)){
            return isPalindrome(s,i+1,j-1);
        }
        else{
            return false;
        }
    }
}
