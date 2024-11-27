package com.growthhungry.practicalExercises;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;

        int sumOfDigits = calculateSumOfDigits(number);

        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits);
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        return sum;
    }
}


