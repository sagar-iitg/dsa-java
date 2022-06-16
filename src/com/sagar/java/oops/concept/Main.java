package com.sagar.java.oops.concept;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        Student[] s1=new Student[5];

        System.out.println(Arrays.toString(s1));

        Student sagar=new Student();
        System.out.println(sagar);
        System.out.println(sagar.rno);
        System.out.println(sagar.name);
        System.out.println(sagar.marks);

        Student rishabh=new Student(194161012,"Rishabh",99.9f);
        System.out.println(rishabh.rno);
        System.out.println(rishabh.name);
        System.out.println(rishabh.marks);

        Car c=new Car();
        System.out.println(c.brand);
        System.out.println(c.color);



    }

}
