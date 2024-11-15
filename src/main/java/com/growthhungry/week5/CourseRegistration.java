package com.growthhungry.week5;

import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Student> students = new ArrayList<>();

    public void registerStudent(Student student) throws CourseFullException {
        if (students.size() >= 5){
            throw new CourseFullException("The course is full. Cannot register more students");
        }
        students.add(student);
        System.out.println("Student " + student.getName() + "(" + student.getAge() + ") registered successfully.");
    }

    public int getRegisteredCount(){
        return students.size();
    }
}
