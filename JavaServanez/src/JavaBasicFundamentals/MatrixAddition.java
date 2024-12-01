package JavaBasicFundamentals;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int matrixA[][] = new int[3][3];
		int matrixB[][] = new int[3][3];
		int sumResult[][] = new int[3][3];

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("Enter a number for Matrix A: ");
				matrixA[row][col] = scan.nextInt();
			}
		}
		System.out.println();

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("Enter a number for Matrix B: ");
				matrixB[row][col] = scan.nextInt();
			}
		}
		System.out.println();
		System.out.println("Matrix A: ");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matrixA[row][col] + " ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println("Matrix B: ");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(matrixB[row][col] + " ");
			}

			System.out.println();
		}

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				sumResult[row][col] = matrixA[row][col] + matrixB[row][col];
			}

		}
		System.out.println();
		System.out.println("The result is: ");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(sumResult[row][col] + " ");

			}

			System.out.println();
		}
	}
}
