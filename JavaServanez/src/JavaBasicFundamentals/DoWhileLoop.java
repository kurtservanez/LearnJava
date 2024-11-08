package JavaBasicFundamentals;

import java.util.Scanner;

/*
 * Looping 
 * Credits: [@Neso Academy on (▶️)]
 */

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Program that checks the integer between 1 and 10
		// DO - WHILE LOOP

		int ans;

		do {
			System.out.print("Enter a number between 1 and 10: ");
			ans = scan.nextInt();

		} while (ans < 1 || ans > 1);

		System.out.print(ans + " is between 1 and 10. Very good!");
	}

}
