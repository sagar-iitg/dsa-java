package com.sagar.javaConcepts.syntax;

public class P4 {


    static int s;

    public static void main(String [] args)

    {

        P4 p = new P4();

        p.start();

        System.out.println(s);

    }



    void start()

    {

        int x = 7;

        twice(x);

        System.out.print(x + " ");

    }



    void twice(int x)

    {

        x = x*2;

        s = x;

    }
}
