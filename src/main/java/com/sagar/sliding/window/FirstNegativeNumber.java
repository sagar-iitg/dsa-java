package com.sagar.sliding.window;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class FirstNegativeNumber {


    public static void main(String[] args) {

        int[] arr={-8, 2, 3, -6, 10};
        int k=2;
        solve(arr,k);

    }

    private static void solve(int[] arr, int k) {

        //start and end is: window size pointer
        int start=0;
        int end=0;
        //length of the array
        int n=arr.length;
        var ans=new ArrayList<Integer>();

        //taking this space for internal calculation
        //Deque<Integer> temp=new ArrayDeque<>();
        var temp=new ArrayDeque<Integer>();

        while(end<n)
        {

            //calculations
            if(arr[end]<0)
            {
                temp.add(arr[end]);
            }
            
            if(end-start+1<k) {
                end++;
            }

            else if (end-start+1==k) {


                if(temp.isEmpty())
                {
                   // System.out.println(0);
                    ans.add(0);
                }
                else{
                   // System.out.println(temp.getFirst());
                    ans.add(temp.getFirst());
                    if(arr[start]==temp.getFirst())
                        temp.removeFirst();

                }

                //slide the window
                start++;
                end++;

            }
        }
        System.out.println(ans);



    }

}
