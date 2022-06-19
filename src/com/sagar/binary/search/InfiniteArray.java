package com.sagar.binary.search;

public class InfiniteArray {


        public static void main(String[] args) {


            int[] arr= {3, 5, 7, 9, 10, 90, 100, 130,
                    140, 160, 170};

            int target=100;

            int res=ans(arr,target);
            System.out.println(res);

        }


        static int ans(int[] arr,int target){

            //Start with box of size 2
            int start=0;
            int end=1;

            while(target > arr[end] ){


                int temp=end+1;
                //double the box value;
                end = end  + (end-start+1)*2;
                start=temp;
                if(end > (arr.length-1)){
                    end= arr.length-1;
                }

            }


            //System.out.println(start);
            //System.out.println(end);
            //return 0;
            return binarySearch(arr,target,start,end);


        }

        static int binarySearch(int[] arr, int target,int start,int end){


           // System.out.println(start +" "+end );



            while(start<=end){

                int mid=start+(end-start)/2;

                if(arr[mid]>target){
                    end=mid-1;

                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                   return mid;
                }
            }
            return -1;
        }


}
