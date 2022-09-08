package com.sagar.javaConcepts.shallowCopy.p1;

public class Driver {


    public static void main(String[] args) {
        A obj=new A();
        obj.i=5;
        obj.j=6;


        //shallow copy
        A obj1=obj;
        obj1.i=2;
        System.out.println(obj.i);

        //deep copy method1
        A obj2=new A();

        System.out.println(obj2.i);
        System.out.println(obj2.j);

        // deep copy method 2
        //A obj3=obj.clone();

    }
}
