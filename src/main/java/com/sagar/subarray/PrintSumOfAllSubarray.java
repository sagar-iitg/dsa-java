package com.sagar.subarray;

public class PrintSumOfAllSubarray {

    public static void main(String[] args) {
        int[] arr={1,2,-6,9,4};

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                System.out.println(sum);
            }
        }
    }
}
