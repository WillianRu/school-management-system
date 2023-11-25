package org.example.entity;

import java.time.LocalDate;


public class Person {
    Integer id;
    String name;
    String lastname;
    LocalDate birthday;

    public Person(Integer id, String name, String lastname, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
}
