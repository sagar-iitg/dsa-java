package com.sagar.interview.questions;

import java.util.Arrays;

public class SegrarateOddEvenNumber {

    public static void main(String[] args) {
        int[] arr={1,25,6,0,23,9,10,28,8};

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2!=0){

                int odd_no=arr[i];
                int j=i;

                while(j>0 && arr[j-1]%2==0){
                    arr[j]=arr[j-1];
                    arr[j-1]=odd_no;
                    j=j-1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
