package com.sagar.leet.code;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

class Pair{
    int count;
    char ch;
    Pair(char ch, int count){
        this.ch=ch;
        this.count=count;
    }

    public int getCount() {
        return count;
    }
    @Override
    public String toString() {
        return "{" + ch + "," + count + "}";
    }
}
public class LeetCode1209 {
    public static void main(String[] args) {

        String s="pbbcggttciiippooaais";
        int k=2;

        Deque<Pair> stack=new ArrayDeque<>();

        for(int i=0;i<s.length();i++){

               char ch=s.charAt(i);
               if(stack.isEmpty()){
                   stack.push(new Pair(ch, 1));
               }else {
                   Pair top = stack.peek();
                   if (top.ch == ch) {
                       // If the current character matches the top character of the stack
                       if (top.count + 1 == k) {
                           // If count reaches k, pop the stack (remove the group)
                           stack.pop();
                       } else {
                           // Otherwise, increment the count
                           stack.pop();
                           stack.push(new Pair(ch, top.count + 1));
                       }
                   }
                   else{
                       stack.push(new Pair(ch, 1));
                   }

               }
            System.out.println(Arrays.deepToString());
        }

        System.out.println(stack);
        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            result.append(String.valueOf(pair.ch).repeat(pair.count));
        }
        System.out.println(result.reverse().toString());


    }
}
