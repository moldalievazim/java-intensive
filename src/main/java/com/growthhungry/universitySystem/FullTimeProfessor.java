package com.growthhungry.universitySystem;

class FullTimeProfessor extends Professor{
    private double monthlySalary;

    public FullTimeProfessor(String name, String department, double monthlySalary){
        super(name, department);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calcSalary(){
        return monthlySalary;
    }
}
