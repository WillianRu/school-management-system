package org.example.service;

import org.example.entity.Course;
import org.example.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AcademicManagmentService implements IAcademicService {
    List <Course> courses;
    List <Student> students;
    HashMap<Course, List<Student>> studentsByCourse;

    public AcademicManagmentService() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.studentsByCourse = new HashMap<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void suscribeStudentCourse(Student student, Course course) {
        List<Student> currentStudents = studentsByCourse.get(course);
        if (currentStudents == null) {
            currentStudents = new ArrayList<>();
        }
        currentStudents.add(student);
        studentsByCourse.put(course, currentStudents);
    }

    public void unsuscribeStudentCourse(Student student, Course course) {

        List<Student> currentStudents = studentsByCourse.get(course);
        currentStudents.remove(student);
        studentsByCourse.put(course, currentStudents);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public HashMap<Course, List<Student>> getStudentsByCourse() {
        return studentsByCourse;
    }
}
