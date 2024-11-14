package com.growthhungry.practicalExercises;

import java.util.Scanner;

public class FactorialNumber {

    public static int getFactorial(int n){
            if(n == 0 || n == 1){
                return 1;
            } else {
                return n * getFactorial(n - 1);
            }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number");
        int number = scanner.nextInt();

        int factorial = getFactorial(number);

        System.out.println("Factorial of " + number + " is " + factorial);

    }
}
