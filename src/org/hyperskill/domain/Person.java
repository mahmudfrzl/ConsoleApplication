package org.hyperskill.domain;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String name;
    private String surname;
    private int age;

    Person() {
    }


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", age=" + age +
               '}';
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getAge() {
        return age;
    }

}
