package com.sagar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 25)
        );

        // Grouping people by age


        // Collecting age statistics
        IntSummaryStatistics ageSummary = people.stream()
            .collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(ageSummary);

        Map<Integer, List<Person>> ageGroups = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
     ageGroups.forEach((x,y)-> {System.out.println(x);
     y.forEach(person -> System.out.println(person.getName()));});


        people.stream()
                .collect(Collectors.groupingBy(Person::getAge))
                .forEach((age, group) -> {
                    System.out.println("Age " + age + ":");
                    group.forEach(person -> System.out.println("  " + person.getName()));
                });

    }
}
