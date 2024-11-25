package JavaBasicFundamentals;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numbers[][] = new int[2][5];
		int sum = 0;

		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print("Enter a number: ");

				numbers[row][col] = scan.nextInt();

				sum += numbers[row][col];

			}
		}

		System.out.println();

		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 5; col++) {

				System.out.print(numbers[row][col] + " ");
			}

			System.out.println();

		}

		System.out.println();
		System.out.println("The sum of the numbers is: " + sum);

	}

}
