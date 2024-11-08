package JavaBasicFundamentals;

import java.util.Scanner;

/*
 * Looping 
 * Credits: [@Neso Academy on (▶️)]
 */

public class WhileLoop {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Program that checks the integer between 1 and 10
		// WHILE LOOP

		System.out.print("Enter a number between 1 and 10: ");
		int ans = scan.nextInt();

		while (ans < 1 || ans > 10) {
			System.out.print(ans + " is not between 1 and 10. Try again: ");
			ans = scan.nextInt();

		}

		System.out.print(ans + " is between 1 and 10. Very good!");

	}

}
