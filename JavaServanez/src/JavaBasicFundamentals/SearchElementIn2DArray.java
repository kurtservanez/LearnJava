package JavaBasicFundamentals;

import java.util.Scanner;

public class TaskSolving {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.println("Enter elements of the 3x3 matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Matrix[" + i + "][" + j + "]: ");
				matrix[i][j] = scan.nextInt();
			}
		}
		System.out.println();
		System.out.print("Enter the element to search: ");
		int target = scan.nextInt();

		
		boolean found = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] == target) {
					System.out.println();
					System.out.println("Element found at position: (" + i + ", " + j + ")");
					found = true;
				}
			}
		}

		if (!found) {
			System.out.println();
			System.out.println("Element not found in the matrix.");
		}

	}
}
