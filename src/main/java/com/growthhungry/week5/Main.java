package com.growthhungry.week5;

import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CourseRegistration courseRegistration = new CourseRegistration();

        while (courseRegistration.getRegisteredCount() < 5){
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();

            System.out.println("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            try {
                Student student = new Student(name, age);
                courseRegistration.registerStudent(student);
            } catch (InvalidNameException | InvalidAgeException e){
                System.out.println("Error: " + e.getMessage());
            } catch (CourseFullException e){
                System.out.println("Error: " + e.getMessage());
            break;
            }
        }

        System.out.println("Registration process completed.");
        scanner.close();
    }
}
