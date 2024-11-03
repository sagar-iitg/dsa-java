package com.sagar.subarray;

public class FIndAllSubarray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        printAllSubarrays(arr,arr.length);
        System.out.println("-----");
        printAllSubarrays1(arr,arr.length);
    }

    private static void printAllSubarrays(int[] arr, int length) {


        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    private static void printAllSubarrays1(int[] arr, int length) {


        for(int i=0;i<arr.length;i++){

            StringBuilder subArray=new StringBuilder();
            for(int j=i;j<arr.length;j++){
                subArray.append(arr[j]).append(" ");
                System.out.println(subArray.toString());
            }
        }
    }
}
