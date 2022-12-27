package com.sagar.binary.search.question;



public class InfiniteArrayDecreasingArray
{


    public static void main(String[] args)
    {

        int arr[]={89,67,45,23,10,9,8,7,6,5,4,3,2,1};

        int target=2;
        int index=searchIndex(arr,target);
        System.out.println(index);

    }

    private static int searchIndex(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while(arr[end]>target)
        {
            int newStart=end+1;

            end=end+2*(end-start+1);


            //checking array length because out of index exception.
            // ArrayOutOfIndex Exception
            if (end>arr.length-1)
            {
                end=arr.length-1;
            }

            start=newStart;
        }
        return search(arr,target,start,end);



    }




    private static int search(int[] arr, int target,int start,int end)
    {

        while(start<=end)
        {

            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {

                return mid;
            }


            else if(arr[mid]<target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }

        return -1;



    }


}

