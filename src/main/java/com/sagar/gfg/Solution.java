package com.sagar.gfg;

class Solution{
    static int maxoccourence(int[] arr,int n,int k){
        // code here
        int[] count=new int[arr.length];

        for(int i=0;i<n;i++)
        {
            count[i]=solve(arr[i],k);
        }


        int index=-1;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<count.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;

            }

        }

        return arr[index];

    }

    public static int solve(int n,int k)
    {
        int temp=n;
        int res=0;
        while(temp!=0)
        {

            int lastDigit=temp%10;
            if(lastDigit==k) res++;

            temp=temp/10;

        }
        return res;

    }

}