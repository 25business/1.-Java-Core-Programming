package com.example;

public class Person {
    private String first_name;
    private String last_name;

    public Person(String in_first_name, String in_last_name) {
        first_name = in_first_name;
        last_name = in_last_name;
    }

    public void setFirstName(String value) {
        first_name = value;
    }

    public boolean equals(Person p) {
        return (first_name.equals(p.first_name) && last_name.equals(p.last_name));
    }


    public String toString() {
        return String.format("%s %s", first_name, last_name);
    }
}
