package JavaBasicFundamentals;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nums[][] = new int[2][5];
		int sum = 0;

		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print("Enter a number: ");
				int num = scan.nextInt();

				nums[row][col] = num;
				sum += nums [row][col];
			}
		}
		System.out.println();

		for (int row = 0; row < 2; row++) {
		for (int col = 0; col < 5; col++) {
			System.out.print(nums[row][col] + " ");
		}
		System.out.println();
		
		}
		System.out.println("The sum is: " + sum);
	}

}
