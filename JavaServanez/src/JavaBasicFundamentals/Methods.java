package JavaBasicFundamentals;

import java.util.Scanner;

public class Methods {

	// Global Variable
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		int result = summation(numbers);
		System.out.println("The sum of the numbers is: " + result);

	}

	static int summation(int numbers[]) {
		int sum = 0;

		for (int num : numbers) {
			sum += num;

		}

		return sum;

	}

}
