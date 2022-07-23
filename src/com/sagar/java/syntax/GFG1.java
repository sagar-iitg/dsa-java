package com.sagar.java.syntax;


class GFG1

{

    static int a;



    static

    {

        a = 4;

        System.out.println ("inside static block");

        System.out.println ("a = " + a);

    }



    GFG1()

    {

        System.out.println ("inside constructor");

         a = 10;

    }



    public static void func()

    {

        a = a + 1;

        System.out.println ("a = " + a);

    }



    public static void main(String[] args)

    {



        GFG1 obj = new GFG1();

       obj.func();



    }

}