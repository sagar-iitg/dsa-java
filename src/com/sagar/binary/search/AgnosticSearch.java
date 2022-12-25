package com.sagar.binary.search;



public class AgnosticSearch {


    public static void main(String[] args) {

       //int arr[]={1,23,45,67,89,90,100};
        int arr[]={100,90,35,23,21,3,-2};
        int target=90;

        int index=agnosticBinarySearch(arr,target);
        System.out.println(index);
    }

    private static int agnosticBinarySearch(int[] arr, int target)
    {

        int start=0;
        int end=arr.length-1;

        boolean isAscending=arr[0]<arr[arr.length-1];
        System.out.println(isAscending);

        while (start<=end)
        {

            int mid=start+(end-start)/2;





            if(arr[mid]==target){
                return mid;
            }

            if(isAscending)
            {
                if(arr[mid]>target)
                {
                    end=mid-1;

                }
                else{
                    start=mid+1;
                }
            }
            else{


                if(arr[mid]<target)
                {
                    end=mid-1;

                }
                else{
                    start=mid+1;
                }


            }


        }


        return  -1;


    }


    static class Solution {


        public static void main(String[] args) {
            int[] nums = {12,345,2,6,7896};
            int ans=findNumbers(nums);
            System.out.println(ans);



        }
        public static  int findNumbers(int[] nums) {
              int res=0;
                for(int i=0;i<nums.length;i++)
                {


                    int totalDigits=count(nums[i]);
                    System.out.println(totalDigits);
                    if(totalDigits%2==0 && totalDigits>1)
                    {
                        res++;
                    }
                }
                return res;

        }

        private static int count(int x){

            System.out.print(x);
            int c=0;
            while(x>0)
            {
                c++;
                c=c/10;

            }
            return c;
        }
    }
}
