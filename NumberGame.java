package Task1_NumberGame;

import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            int guess;

            System.out.println("\n Guess the number (1-100)");
            System.out.println("You have 5 attempts!");

            while (attempts > 0) {
                System.out.print("Enter guess: ");
                guess = sc.nextInt();

                if (guess == number) {
                    System.out.println(" Correct! You win!");
                    break;
                } else if (guess > number) {
                    System.out.println("Too High ");
                } else {
                    System.out.println("Too Low ");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println(" You lost! Number was: " + number);
            }

            System.out.print("Play again? (yes/no): ");
            String choice = sc.next();
            playAgain = choice.equalsIgnoreCase("yes");
        }

        sc.close();
    }
}