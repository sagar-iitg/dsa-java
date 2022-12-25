package com.sagar.leet.code;

public class LeetCode744 {


    public static void main(String[] args) {


        char[] letters ={'x','x','y'};
        char target = 'z';
        char res=nextGreatestLetter(letters,target);
        System.out.println(res);


    }


    public static char nextGreatestLetter(char[] letters, char target)
    {


        int start=0;
        int end=letters.length-1;




        while (start<=end)
        {
            int mid=start+(end-start)/2;




            if(letters[mid]<=target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }



        }
        //System.out.println(start);
      //  System.out.println(letters.length);
        return letters[start%letters.length];

    }
}
