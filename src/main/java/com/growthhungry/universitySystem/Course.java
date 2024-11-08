package com.growthhungry.universitySystem;

import java.util.ArrayList;

class Course {
    private String courseName;
    private int creditHours;
    private ArrayList<Student> students;

    public Course (String courseName, int creditHours) {
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.students = new ArrayList<>();
    }

    public void addStudent (Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void listStudents () {
        for (Student student : students) {
            System.out.println("Student: " + student.getStudentName());
        }
    }
}
