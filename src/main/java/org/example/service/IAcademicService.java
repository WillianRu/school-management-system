package org.example.service;

import org.example.entity.Course;
import org.example.entity.Student;

public interface IAcademicService  {

    void enrollStudent(Student student);
    void addCourse(Course course);
    void suscribeStudentCourse(Student student, int idCourse);
    void unsuscribeStudentCourse(Student student, int idCourse);
}
