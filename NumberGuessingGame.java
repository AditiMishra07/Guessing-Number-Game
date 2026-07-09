import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String playAgain;

        do {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;

            int guess = 0;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("\n----- Welcome to Number Guessing Game -----");
            System.out.println("You have " + maxAttempts + " attempts to guess the number (1-100)");

            while (guess != numberToGuess && attempts < maxAttempts) {
                System.out.println("Enter your guess:");
                guess = sc.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed in " + attempts + " attempts");
                }
            }

            if (attempts == maxAttempts && guess != numberToGuess) {
                System.out.println("Game Over! The number was: " + numberToGuess);
            }

            System.out.println("Do you want to play again? (yes/no)");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}