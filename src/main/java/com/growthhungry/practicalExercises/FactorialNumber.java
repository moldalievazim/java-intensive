package com.growthhungry.practicalExercises;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args){
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

        }
        System.out.println("Factorial of " + number + " is " + factorial);

    }
}
