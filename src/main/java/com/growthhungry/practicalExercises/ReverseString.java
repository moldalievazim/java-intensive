package com.growthhungry.practicalExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scanner.nextLine();
        char ch;
        String newStr = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            ch = input.charAt(i);
            newStr = newStr + ch;
        }
        System.out.println("Reversed word is: " + newStr);
    }
}

