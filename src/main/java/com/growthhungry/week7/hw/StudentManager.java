package com.growthhungry.week7.hw;

import com.growthhungry.week7.practical.ToDo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    public static void saveStudentsToFile(String filePath, List<Student> students) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        }
    }

    public static List<Student> loadStudentsFromFile(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                students.add(Student.fromString(line));
            }
        }
        return students;
    }

    public static void displayAllStudents(List<Student> students) {
        for(Student student : students) {
            System.out.println("ID: " + student.getId() + ", NAME: " + student.getName() + ", GRADE: " + student.getGrade());
        }
    }

    public static void updateGrade(int id, double newGrade, String filePath) throws IOException {
        List<Student> students = loadStudentsFromFile(filePath);
        for (Student student : students){
            if(student.getId() == id){
                student.grade = newGrade;
                break;
            }
        }
        saveStudentsToFile(filePath, students);
    }

    public static void deleteStudent(int id, String filePath) throws IOException{
        List<Student> students = loadStudentsFromFile(filePath);
        for (Student student : students) {
            if (student.getId() == id){
                students.remove(student);
                break;
            }
        }
        saveStudentsToFile(filePath, students);
    }
}
