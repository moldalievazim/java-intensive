package com.growthhungry.universitySystem;

class AdjunctProfessor extends Professor {
    private int coursesTaught;

    public AdjunctProfessor(String name, String department, int coursesTaught){
        super(name, department);
        this.coursesTaught = coursesTaught;
    }

    @Override
    public double calcSalary(){
        return coursesTaught * 500;
    }
}
