package com.sagar.javaConcepts.oops.concept;

public class Student {
    int rno=194161013;
    String name="Sagar kumar";
    float  marks=91.0f;

    Student(int rno,String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;


    }
    Student(Student other){
        this.rno= other.rno;
        this.name=other.name;
        this.marks= other.marks;


    }
    Student(){

        this.rno=19;
        this.name="sk";
        this.marks=90.0f;
    }



}
