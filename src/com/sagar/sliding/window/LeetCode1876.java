package com.sagar.sliding.window;

public class LeetCode1876 {


    public static void main(String[] args) {

        String str="xyzzaz";
        int ans=solve(str);
        System.out.println(ans);


    }

    private static int solve(String str) {

        int n=str.length();
        //k=windows size
        int k=3;

        for(int i=0;i<n-k+1;i++)
        {

            for(int j=i;j<i+k;j++)
            {
                System.out.print(str.charAt(j));
            }

            System.out.println();
        }
        return 0;


    }
}
