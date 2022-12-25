package com.sagar.binary.search.question;

/*



Ceiling  :
Smallest element in array greater then or equal to target element.

 */

/*



floor:
greatest element in array less or equal to target element.

 */



import javax.xml.transform.stax.StAXResult;

public class CelingOfaNoBinarySearch {


    public static void main(String[] args) {
        int[] arr=new int[]{10,20 ,30,40,50,60,70};

        int target=-1;
        int res=solution(arr, target);
        System.out.println(res);
        //System.out.println(arr[res]);


    }

    private static int solution(int arr[],int target)
    {

        int start=0;
        int end=arr.length-1;


        while (start<=end)
        {
            int mid=start+(end-start)/2;



            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
               start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }


        }

        if(start<=arr.length-1)
            return start;
        else
            return -1;



    }
}
