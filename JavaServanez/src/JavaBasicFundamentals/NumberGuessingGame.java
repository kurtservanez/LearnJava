package JavaBasicFundamentals;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		String playAgain;

		System.out.println("Welcome to the Number of Guessing Game!");
		System.out.println("I have selected number between 1-100. Can you guess it?");
		System.out.println("You have only 7 attempts!");

		do {

			int number = random.nextInt(100) + 1;
			int ans;
			int attempt = 0;

			while (attempt < 7) {
				System.out.println();
				System.out.print("Enter you guess : ");
				ans = scan.nextInt();

				if (ans == number) {
					System.out.println("Correct! you guessed it in " + (attempt + 1) + " attempts");
					break;
				}

				if (attempt == 6) {
					System.out.println("You lose! Attempt [" + (attempt + 1) + "]");
					System.out.println("The answer was: " + number);
					break;
				}

				if (number < ans) {
					System.out.println("Lower! Try again. Attempt [" + (attempt + 1) + "]");

				} else {
					System.out.println("Higher! Try again. Attempt [" + (attempt + 1) + "]");
				}

				attempt++;

			}

			System.out.println();
			System.out.print("Do you want to play again? (y/n): ");
			playAgain = scan.next();

		} while (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("yes"));

		System.out.println("Thank you for playing! Goodbye!");

	}
}
