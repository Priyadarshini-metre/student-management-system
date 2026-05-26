package com.sms;

import java.util.ArrayList;

public class StudentManagement {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully");
    }

    public void viewStudents() {

        if(students.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }

        for(Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(int id) {

        for(Student s : students) {

            if(s.getId() == id) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public void deleteStudent(int id) {

        students.removeIf(s -> s.getId() == id);

        System.out.println("Student Deleted Successfully");
    }
}
