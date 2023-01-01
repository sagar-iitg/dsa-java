package com.sagar.leet.code;

public class LeetCode1464 {


    public static void main(String[] args)
    {

        int[] arr={10,2,5,2};
        System.out.println(maxProduct(arr));

    }


    public static int maxProduct(int[] nums)
    {


        int largest=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]>largest)
            {
                largest=nums[i];
                index=i;
            }
        }

        int secondLargest=nums[0];
        int index1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(index!=i && nums[i]>secondLargest)
            {
                secondLargest=nums[i];
                index1=i;
            }
        }
        System.out.println(index+"--- "+index1);
        return (nums[index]-1)*(nums[index1]-1);


    }
}
