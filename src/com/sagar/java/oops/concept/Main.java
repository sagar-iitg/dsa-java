package com.sagar.java.oops.concept;

import java.util.Arrays;

class Student {

    int rno;
    String name;
    float  marks;
}


public class Main {

    public static void main(String[] args) {
        Student[] s1=new Student[5];
        System.out.println(Arrays.toString(s1));

    }

}
