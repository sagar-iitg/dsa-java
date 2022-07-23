package com.sagar.Array;

public class RotateArray {


    public static void main(String[] args) {


        int[] arr=new int[]{2,4,6,8,10,12,14,16,18,20};
       // System.out.println(arr[0]);
        int n=arr.length;
        int d=3;
        System.out.println("inside main");
        for ( int i:arr) {
            //System.out.println("hh");
            System.out.print(i+" ");
        }

        System.out.println();
        rotateArr(arr,d,n);

    }

    private static void rotateArr(int[] arr, int d, int n) {

        int[] a=new int[d];


        for(int i=0;i<d;i++){
            a[i]=arr[i];
        }
        for (int x:a) {
            System.out.print(x+" ");
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        System.out.println();
        for (int x:arr) {
            System.out.print(x+" ");
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=a[i];
        }
        System.out.println();
        for (int x:arr) {
            System.out.print(x+" ");
        }




    }
}
