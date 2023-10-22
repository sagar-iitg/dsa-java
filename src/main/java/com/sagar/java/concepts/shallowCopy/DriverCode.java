package com.sagar.java.concepts.shallowCopy;

public class DriverCode {

    public static void main(String[] args) {

        ShallowCopy user1=new ShallowCopy();

        System.out.println(user1);
        ShallowCopy user2=user1;

        System.out.println(user2.getAdd());

    }
}
