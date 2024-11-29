package com.growthhungry.week7.hw;

import com.growthhungry.week7.practical.ToDo;

public class Student {
    int id;
    String name;
    double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public double getGrade() { return grade; }

    @Override
    public String toString() { return id + "," + name + "," + grade; }

    public static Student fromString(String data) {
        String[] fields = data.split(",");
        int id = Integer.parseInt(fields[0]);
        String name = fields[1];
        double grade = Double.parseDouble(fields[2]);
        return new Student(id, name, grade);
    }
}
