package com.hy.domain;

public class Person {

    private String lastName;
    private String firstName;
    private Integer age;

    public Person(String lastName, String firstName, Integer age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLast() {
        return lastName;
    }
}
