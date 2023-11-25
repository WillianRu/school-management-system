package org.example;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.service.AcademicManagmentService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate birthday= LocalDate.of(1999,4,30);
        LocalDate birthdayTwo= LocalDate.of(2000,5,30);

        Course poo = new Course(1230,"Programacion orientada a objetos", "Es un curso de programacion orientada a objetos", 3, 1 );
        Course bd = new Course(1250,"Bases de datos", "Es un curso de bases de datos", 3, 2 );
        Student pepito = new Student(301, "Pepito", "Perez", birthday);
        Student emilio = new Student(304, "Emilio", "Perez", birthdayTwo);

        AcademicManagmentService managmentService = new AcademicManagmentService();
        
        managmentService.addCourse(poo);
        managmentService.addCourse(bd);
        managmentService.enrollStudent(pepito);
        managmentService.enrollStudent(emilio);

        List<Course> courses = managmentService.getCourses();
        for (Course course : courses) {
            System.out.println(course.toString());
        }

        List<Student> students = managmentService.getStudents();
        for (Student student : students) {
            System.out.println(student.toString());
        }

        managmentService.suscribeStudentCourse(pepito,poo);
        managmentService.suscribeStudentCourse(emilio,poo);

        managmentService.unsuscribeStudentCourse(emilio,poo);
        HashMap<Course, List<Student>> studentsByCourse = managmentService.getStudentsByCourse();
        for (Map.Entry<Course, List<Student>> entry : studentsByCourse.entrySet()) {
            Course course = entry.getKey();
            List<Student> currentStudents = entry.getValue();

            System.out.println("Curso: " + course.getName());
            System.out.println("Estudiantes:");

            for (Student student : currentStudents) {
                System.out.println("- " + student.getName());
            }
            System.out.println();
        }

        managmentService.suscribeStudentCourse(pepito,bd);
        managmentService.suscribeStudentCourse(emilio,bd);
        managmentService.unsuscribeStudentCourse(pepito,bd);

        for (Map.Entry<Course, List<Student>> entry : studentsByCourse.entrySet()) {
            Course course = entry.getKey();
            List<Student> currentStudents = entry.getValue();

            System.out.println("Curso: " + course.getName());
            System.out.println("Estudiantes:");

            for (Student student : currentStudents) {
                System.out.println("- " + student.getName());
            }
            System.out.println();
        }
    }
}