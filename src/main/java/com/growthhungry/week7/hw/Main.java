package com.growthhungry.week7.hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "students.txt";
        List<Student> students = new ArrayList<>();

        // Creating sample student objects
        students.add(new Student(101, "John Doe", 88.50));
        students.add(new Student(102, "Joe Kim", 83.70));
        students.add(new Student(103, "Taylor Swift", 75.50));

        try{
            //saving students to file
            StudentManager.saveStudentsToFile(filePath, students);
            System.out.println("Students saved to file.");

            //loading and displaying students from file
            List<Student> loadedStudents = StudentManager.loadStudentsFromFile(filePath);
            System.out.println("Loaded students: ");
            StudentManager.displayAllStudents(loadedStudents);

            //updating a student's grade
            StudentManager.updateGrade(102, 90.3, filePath);
            System.out.println("\nUpdated students after changing ID 102's grade: ");
            loadedStudents = StudentManager.loadStudentsFromFile(filePath);
            StudentManager.displayAllStudents(loadedStudents);

            //deleting a student from file
            StudentManager.deleteStudent(101, filePath);
            System.out.println("\nUpdated students after deleting student with ID 101.");
            loadedStudents = StudentManager.loadStudentsFromFile(filePath);
            StudentManager.displayAllStudents(loadedStudents);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
