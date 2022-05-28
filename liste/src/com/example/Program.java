package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(5);
        brojevi.addAll(Arrays.asList(new Integer[] {8, 7, 6, 5, 4}));
        System.out.println(brojevi);
        brojevi.remove(2);
        System.out.println(brojevi);
        System.out.println(brojevi.get(1));
        brojevi.add(2, 30);
        System.out.println(brojevi);
        brojevi.set(3, 99);
        System.out.println(brojevi);

        Person p1 = new Person("Chad", "Mann");
        Person p2 = new Person("Chad", "Mann");
        System.out.println(p1.equals(p2));



        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe"));
        people.add(new Person("Jane", "Doe"));

        System.out.println(people);
    }
}
