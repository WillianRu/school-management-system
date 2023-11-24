package org.example.entity;

import java.util.Date;

public class Person {
    Integer id;
    String name;
    String lastname;
    Date birthday;

    public Person(Integer id, String name, String lastname, Date birthday) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
    }
}
