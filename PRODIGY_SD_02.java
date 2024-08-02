package com.tech;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int userGuess = 0;
        
        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Try to guess the number!");

        // Loop until the user guesses the number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            
            // Check if input is a valid integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
            
            userGuess = scanner.nextInt();
            numberOfAttempts++;

            // Provide feedback based on the user's guess
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.printf("It took you %d attempts to guess the number.%n", numberOfAttempts);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
