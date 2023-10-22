package com.sagar.patterns.questions;

public class Patterns {


    public static void main(String[] args)
    {

        //pattern2(4);
        pattern5(5);

    }


    private static void pattern5(int n)
    {
        for(int row=1;row<=n;row++)
        {
            //for every row run the cols
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();


        }

    }


    private static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {
            //for every row run the cols
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();


        }

    }


    private static void pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            //for every row run the cols
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();


        }

    }



    private static void pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {
            //for every row run the cols
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();


        }


    }

    private static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            //for every row run the cols
            for(int col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();


        }

    }



}
