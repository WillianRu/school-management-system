package org.example.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AcademicManagment {
    List <Course> courses;
    List <Student> students;
    HashMap <Course, ArrayList<Student>> studentsByCourse;

    public AcademicManagment(List<Course> courses, List<Student> students, HashMap<Course, ArrayList<Student>> studentsByCourse) {
        this.courses = courses;
        this.students = students;
        this.studentsByCourse = studentsByCourse;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public HashMap<Course, ArrayList<Student>> getStudentsByCourse() {
        return studentsByCourse;
    }

    public void setStudentsByCourse(HashMap<Course, ArrayList<Student>> studentsByCourse) {
        this.studentsByCourse = studentsByCourse;
    }
}
