package com.sagar.interview.netradyne;

public class SeondLargestElementInArray {


    public static void main(String[] args) {

        int[] arr={5,3,4,1};


        int max=-1;
        int second=-1;


        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                continue;
            }
            second=Math.max(second,arr[i]);
        }
        System.out.println(second);



    }
}
