package com.sagar.array;

public class RotateSortedArray {


    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        //{1,2,3,4,5,6,7}
        //{7,6,5,4,1,2,3,}
        int target=0;
        int ans=binarySearch(arr,target,0,arr.length-1);
        System.out.println(ans);

    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        if(start>end) return -1;
        int mid=(start+end)>>>1;



            if(arr[mid]==target) return mid;

            //right hallf is sorted
            if(arr[start]>arr[mid]){

                if(arr[mid]<target && arr[end]>=target){
                    return binarySearch(arr,target,mid+1,end);
                }else{
                    return binarySearch(arr,target,start,mid-1);
                }
            }else{

                if(arr[start]<=target && arr[mid]>target){
                    return  binarySearch(arr,target,start,mid-1);
                }else{
                    return binarySearch(arr,target,mid+1,end);
                }
            }



    }
}
