package JavaBasicFundamentals;

import java.util.Scanner;

public class SumRowsColumns {
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
		System.out.println("Sum of rows:");
		for (int i = 0; i < 3; i++) {
			int rowSum = 0;
			for (int j = 0; j < 3; j++) {
				rowSum += matrix[i][j];
			}
			System.out.println("Row " + i + ": " + rowSum);
		}

		System.out.println();
		System.out.println("Sum of columns:");
		for (int j = 0; j < 3; j++) {
			int colSum = 0;
			for (int i = 0; i < 3; i++) {
				colSum += matrix[i][j];
			}
			
			System.out.println("Column " + j + ": " + colSum);
		}

	}
}
