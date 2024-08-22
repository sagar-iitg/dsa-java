package com.sagar.epam.practice1;

import java.util.List;

public class MaximumProductThreeElement {

    public static void main(String[] args) {
        int[] arr={-1,-2,35,30,70,9,45,0,-10,-8};

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int ele:arr){

            if(ele>max1){
                max3=max2;
                max2=max1;
                max1=ele;
            }
            else if(ele>max2){
                max3=max2;
                max2=ele;
            }
            else if(ele>max3){
                max3=ele;
            }


            if(ele<min1){
                min2=min1;
                min1=ele;
            }
            else if(ele<min2){
                min2=ele;
            }
        }
        System.out.println(List.of(max1,max2,max3,min1,min2));
        System.out.println(max1*max2*max3);
        System.out.println(min1*min2);


    }
}
