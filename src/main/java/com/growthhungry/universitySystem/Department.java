package com.growthhungry.universitySystem;

import java.util.ArrayList;

class Department {
    private String departmentName;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    public Department(String departmentName){
        this.departmentName = departmentName;
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addProfessor(Professor professor){
        professors.add(professor);
    }

    public void addCourse (Course course){
        courses.add(course);
    }

    public String getDepartmentName (){
        return departmentName;
    }

    public void listProfessors () {
        for (Professor professor : professors) {
            System.out.println("Professor: " + professor.getName());
            System.out.println("Teaches at: " + professor.getDepartment() + " department. Salary is: " + professor.calcSalary() + "\n");
        }
    }

    public void listCourses () {
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }
}
