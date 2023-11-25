package org.example.entity;

import java.time.LocalDate;

public class Student extends Person {
    public Student(Integer id, String name, String lastname, LocalDate birthday) {
        super(id, name, lastname, birthday);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
