package com.sagar.binary.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {


    public static void main(String[] args) {



        Integer[] arr={1,2,4,5,7,90,100};
        int target=100;

        List<Integer> al=new ArrayList<>(Arrays.asList(arr));

        System.out.println(Collections.binarySearch(al,100));

        boolean res=binarySearch(arr,target);
        System.out.println(res);
    }

    private static  boolean binarySearch(Integer[] arr,int target)
    {


        int start=0;
        int end=arr.length-1;
        int NoOfComparision=0;
        while(start<=end)
        {

            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                System.out.println(NoOfComparision);
                return true;
            }


            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            NoOfComparision++;

        }

        return false;


    }
}
