package com.sagar.javaConcepts.shallowCopy;

public class ShallowCopy {

        String name="sk";
        Address add=new Address("Manihari Patti", "Giridih","Jharkhand", "825412");

        public void setName(String name) {
                this.name = name;

        }

        public String getName() {
                return name;
        }

        public Address getAdd() {
                return add;
        }

        public void setAdd(Address add) {
                this.add = add;
        }

        @Override
        public String toString() {
                return "ShallowCopy{" +
                        "name='" + name + '\'' +
                        ", add=" + add +
                        '}';
        }
}
