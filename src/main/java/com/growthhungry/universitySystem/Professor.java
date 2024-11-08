package com.growthhungry.universitySystem;

abstract class Professor {
    private String name;
    private String department;

    public Professor (String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public abstract double calcSalary();

    public void teachCourse(){
        System.out.println(name + " is teaching in the " + department + " department.");
    }
}
