package com.sagar.math;

public class XOR {


    public static void main(String[] args)
    {
        for(int i=1;i<=20;i++)
        {
            int ans=XOR1toN(i);
            int ans1=XOR1toNSolve(i);
            System.out.println(ans1+" "+ans+" ");
        }
    }

    private static int XOR1toN(int n) {

        int res=0;
        for(int i=1;i<=n;i++)
        {
            res=res^i;

        }
        return res;


    }


    private static int XOR1toNSolve(int n)
    {

       if(n%4==0)
           return n;
       if(n%4==3)
       {
           return 0;
       }
       if(n%4==2)
       {
           return n+1;
       }

            return 1;

    }

}
