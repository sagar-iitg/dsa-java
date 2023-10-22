package com.sagar.array;

import java.util.Arrays;

public class SecondLargestElementInArray {


    public static void main(String[] args)
    {
        int[] arr={1,5,4,5};
        System.out.println(Arrays.toString(arr));
        solve(arr);
    }

    public static void solve(int[] arr)
    {


        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;



        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];

            }
             /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }

        System.out.println(largest);

        System.out.println(secondLargest);



    }
}
