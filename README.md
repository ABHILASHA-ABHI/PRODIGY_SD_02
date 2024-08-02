# PRODIGY_SD_02
Build a program that generates a random number and challenges the user to guess it. The program should prompt the user to input their guess, compare it to the generated number, and provide feedback if the guess is too high or too low. It should continue until the user correctly guesses the number and then display the number of attempts it took to win the game.

## Project Overview

The "Guess the Number Game" is a simple Java program designed to engage users in a number guessing challenge. The program generates a random number between 1 and 100, and the user's task is to guess this number. The program provides feedback on whether the user's guess is too high or too low, and it continues to prompt for guesses until the correct number is guessed. Upon guessing correctly, the program reveals the number of attempts taken.

## Features

1. **Random Number Generation**: The program generates a random number between 1 and 100 using Java's `Random` class.
2. **User Input Handling**: The program prompts the user for guesses and handles non-integer inputs gracefully.
3. **Feedback Mechanism**: It provides feedback if the guess is too high or too low.
4. **Guess Tracking**: The program counts and displays the number of attempts taken to guess the correct number.
5. **User-Friendly Interface**: Simple and clear prompts guide the user through the guessing process.

## Results

The program runs in a loop, continuously prompting the user for a guess until the correct number is guessed. It provides instant feedback for each guess, making the game interactive and engaging. The number of attempts taken is displayed once the correct guess is made, offering a sense of accomplishment.

## Examples

Here is an example of how the game interaction might look:

```
Welcome to Guess the Number Game!
I have generated a random number between 1 and 100.
Try to guess the number!
Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 63
Too low! Try again.
Enter your guess: 70
Congratulations! You've guessed the number.
It took you 4 attempts to guess the number.
```

## Conclusion

The "Guess the Number Game" is a straightforward yet entertaining program that showcases basic programming concepts such as random number generation, user input handling, loops, and conditional statements. It provides a fun and interactive way for users to engage with the program while practicing their guessing skills. The feedback and attempt tracking features add to the user experience, making it a complete and enjoyable game.
