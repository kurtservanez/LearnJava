package JavaBasicFundamentals;

import java.util.Scanner;

public class TaskSolving {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int matrix[][] = new int[3][3];

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("Enter a number: ");
				matrix[row][col] = scan.nextInt();

			}
		}

		int largestNum = matrix[0][0];
		int largestRow = 0;
		int largestCol = 0;

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (matrix[row][col] > largestNum) {
					largestNum = matrix[row][col];
					largestRow = row;
					largestCol = col;
				}
			}

		}
		System.out.println();
		System.out.println("Largest element: " + largestNum);
		System.out.println("Position: (" + largestRow + ", " + largestCol + ")");
	}
}
