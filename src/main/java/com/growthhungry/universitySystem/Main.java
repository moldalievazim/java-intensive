package com.growthhungry.universitySystem;

public class Main {
    public static void main(String[] args){

        Department csDept = new Department("Computer Science");

        FullTimeProfessor profSmith = new FullTimeProfessor("Dr. John Smith", "Computer Science", 5000);
        AdjunctProfessor profBrown = new AdjunctProfessor("Dr. Mary Brown", "Computer Science", 3);

        csDept.addProfessor(profSmith);
        csDept.addProfessor(profBrown);

        Course javaCourse = new Course("Java Programming", 3);
        Course dsCourse = new Course("Data Structures", 4);

        csDept.addCourse(javaCourse);
        csDept.addCourse(dsCourse);

        Student janeDoe = new Student("Jane Doe", 101);
        Student markLee = new Student("Mark Lee", 102);

        javaCourse.addStudent(janeDoe);
        dsCourse.addStudent(markLee);

        janeDoe.addGrade(javaCourse, 95);
        markLee.addGrade(dsCourse, 85);

        csDept.listProfessors();
        janeDoe.printGradeReport();
        markLee.printGradeReport();
    }
}
