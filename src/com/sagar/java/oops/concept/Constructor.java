package com.sagar.java.oops.concept;



public class Constructor {
    public static void main(String[] args) {

        Student s1=new Student();

        s1.rno=1;
        s1.marks=90.9f;
        s1.name="Hi ";
        System.out.println(s1);
        Student s2=new Student(s1);
        System.out.println(s1.rno);
        System.out.println(s2);
        System.out.println(s2.rno);

    }

}
