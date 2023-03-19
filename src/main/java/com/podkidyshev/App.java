package com.podkidyshev;

import com.podkidyshev.dao.StudentDAO;
import com.podkidyshev.entity.Student;

import java.util.List;

public class App {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

//        studentDAO.create(new Student("Sergiy", "sergiy@mail.com"));
//        studentDAO.create(new Student("Petro", "petro@gmail.com"));
//        studentDAO.create(new Student("Valyl", "vasyl@mail.com"));
//        studentDAO.create(new Student("Yulia", "yulia@mail.com"));
//        studentDAO.create(new Student("Ignat", "ignat@rambler.com"));
//
//        List<Student> students = studentDAO.getAll();
//
//        for (Student s : students) {
//            System.out.println(s);
//        }

//        studentDAO.update(new Student(10L, "Usama", "Usama@rambler.com"));
//
//        studentDAO.delete(new Student(10L, "Usama", "Usama@rambler.com"));

        System.out.println(studentDAO.getById(1L));

    }
}
