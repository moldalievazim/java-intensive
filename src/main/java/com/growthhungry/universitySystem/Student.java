package com.growthhungry.universitySystem;

import java.util.HashMap;

class Student {
    private String studentName;
    private int studentID;
    private HashMap<Course, Integer> grades;

    public Student (String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grades = new HashMap<>();
    }

    public void addGrade (Course course, int grade) {
        grades.put(course, grade);
    }

    public String getStudentName(){
        return studentName;
    }

    public void printGradeReport () {
        System.out.println("Grade Report for: " + studentName);

        for (Course course : grades.keySet()) {
            System.out.println("Course: " + course.getCourseName() + ", Grade: " + grades.get(course) + "\n");
        }
    }
}
