package org.example.entity;

import java.util.Date;

public class Student {
    Integer id;
    String name;
    String lastname;
    Date birthday;

    public Student(Integer id, String name, String lastname, Date birthday) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
