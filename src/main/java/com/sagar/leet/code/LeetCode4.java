package com.sagar.leet.code;

public class LeetCode4 {
    public static void main(String[] args) {
        
        int[] arr1={1,3,4,7,10,12};
        int[] arr2={2,6,15};
        double ans=median(arr1,arr2);
        System.out.println(ans);
    }

    private static double median(int[] arr1, int[] arr2) {

        if(arr1.length>arr2.length)
            return median(arr2,arr1);

        int m=arr1.length;
        int n=arr2.length;

        int start=0;
        int end=m;
        int left=(m+n+1)/2;

        while (start<=end){

            int mid1=start+(end-start)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;

            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

             if(mid1<m) r1=arr1[mid1];
             if(mid2<n) r2=arr2[mid2];

            if(mid1-1>=0) l1=arr1[mid1-1];
            if(mid2-1>=0) l2=arr2[mid2-1];

            if(l1<=r2 && l2<=r1){
                if((m+n)%2==1){
                    return Math.max(l1,l2);
                }
                else{
                    return (double) (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }
            else if(l1>r2){
                end=mid1-1;
            }
            else{
                start=mid1+1;
            }


        }
        return 0;

    }
}
