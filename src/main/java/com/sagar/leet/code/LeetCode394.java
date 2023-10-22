package com.sagar.leet.code;


import java.util.ArrayDeque;
import java.util.Deque;

class LeetCode394 {


    public static void main(String[] args) {
        String ans=decodeString("3[a]2[bc]");
        System.out.println(ans);
    }
    public static String decodeString(String s) {
        Deque<String> st=new ArrayDeque<>();
        for(char ch:s.toCharArray())
        {

            if(ch==']'){
                StringBuilder stringToRepeat=new StringBuilder("");
                while(!st.isEmpty() && !Character.isDigit(st.peek().charAt(0))){

                    String top=st.peek();
                    if(!"[".equals(top))
                        stringToRepeat.append(top);
                    st.pop();


                }
                StringBuilder numericTimes=new StringBuilder("");
                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){

                    numericTimes.append(st.peek());
                    st.pop();

                }
                //StringBuilder reversedString = new StringBuilder(numericTimes);
                // Use the reverse() method to reverse the string
                numericTimes.reverse();
               // String result = reversedString.toString();
                 int n=Integer.parseInt(numericTimes.toString());
                 //final decoding
                StringBuilder decodeString=new StringBuilder("");
                while(n>0)
                {
                    decodeString.append(stringToRepeat);
                    n--;

                }
                st.push(decodeString.toString());



            }
            else{
                String temp=Character.toString(ch);
                st.push(temp);

            }
        }

        StringBuilder ans=new StringBuilder("");
        while (!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        return ans.reverse().toString();




    }
}