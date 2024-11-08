package JavaBasicFundamentals;

import java.util.Scanner;

public class TransRemarks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isValid = true;

		System.out.print("Enter student name: ");
		String name = scan.nextLine();

		System.out.print("Enter grade for Written Task (20%): ");
		double wt = scan.nextDouble();

		System.out.print("Enter grade for Performance Task (60%): ");
		double pt = scan.nextDouble();

		System.out.print("Enter grade for Exam (20%): ");
		double exam = scan.nextDouble();
		System.out.println();

		double initialGrade = (wt * .20) + (pt * .60) + (exam * .20);

		if (initialGrade > 100 || initialGrade < 0)
			isValid = false;

		if (isValid)
			System.out.println("The initial grade is " + initialGrade);

		int finalGrade = 0;

		if (isValid) {

			if (initialGrade == 100) {
				finalGrade = 100;
			} else if (initialGrade >= 98.40 && initialGrade <= 99.99) {
				finalGrade = 99;
			} else if (initialGrade >= 96.80) {
				finalGrade = 98;
			} else if (initialGrade >= 95.20) {
				finalGrade = 97;
			} else if (initialGrade >= 93.60) {
				finalGrade = 96;
			} else if (initialGrade >= 92.00) {
				finalGrade = 95;
			} else if (initialGrade >= 90.40) {
				finalGrade = 94;
			} else if (initialGrade >= 88.80) {
				finalGrade = 93;
			} else if (initialGrade >= 87.20) {
				finalGrade = 92;
			} else if (initialGrade >= 85.60) {
				finalGrade = 91;
			} else if (initialGrade >= 84.00) {
				finalGrade = 90;

			} else if (initialGrade >= 82.40) {
				finalGrade = 89;
			} else if (initialGrade >= 80.80) {
				finalGrade = 88;
			} else if (initialGrade >= 79.20) {
				finalGrade = 87;
			} else if (initialGrade >= 77.60) {
				finalGrade = 86;
			} else if (initialGrade >= 76.00) {
				finalGrade = 85;
			} else if (initialGrade >= 74.40) {
				finalGrade = 84;
			} else if (initialGrade >= 72.80) {
				finalGrade = 83;
			} else if (initialGrade >= 71.20) {
				finalGrade = 82;
			} else if (initialGrade >= 69.60) {
				finalGrade = 81;
			} else if (initialGrade >= 68.00) {
				finalGrade = 80;

			} else if (initialGrade >= 66.40) {
				finalGrade = 79;
			} else if (initialGrade >= 64.90) {
				finalGrade = 78;
			} else if (initialGrade >= 63.20) {
				finalGrade = 77;
			} else if (initialGrade >= 61.60) {
				finalGrade = 76;
			} else if (initialGrade >= 60.00) {
				finalGrade = 75;
			} else if (initialGrade >= 56.00) {
				finalGrade = 74;
			} else if (initialGrade >= 52.00) {
				finalGrade = 73;
			} else if (initialGrade >= 48.00) {
				finalGrade = 72;
			} else if (initialGrade >= 44.00) {
				finalGrade = 71;
			} else if (initialGrade >= 40.00) {
				finalGrade = 70;

			} else if (initialGrade >= 36.00) {
				finalGrade = 69;
			} else if (initialGrade >= 32.00) {
				finalGrade = 68;
			} else if (initialGrade >= 28.00) {
				finalGrade = 67;
			} else if (initialGrade >= 24.00) {
				finalGrade = 66;
			} else if (initialGrade >= 20.00) {
				finalGrade = 65;
			} else if (initialGrade >= 16.00) {
				finalGrade = 64;
			} else if (initialGrade >= 12.00) {
				finalGrade = 63;
			} else if (initialGrade >= 8.00) {
				finalGrade = 62;
			} else if (initialGrade >= 4.00) {
				finalGrade = 61;
			} else if (initialGrade >= 0) {
				finalGrade = 60;

			}

		} else
			System.out.println("Invalid Input");

		if (isValid)
			System.out.println("The final (transmuted) grade of " + name + " is " + finalGrade);

		System.out.println();
		System.out.println("Comment:");

		if (finalGrade == 100)
			System.out.println("Perfect!");
		else if (finalGrade >= 90)
			System.out.println("Very Good!");
		else if (finalGrade >= 80)
			System.out.println("Good!");
		else if (finalGrade >= 75)
			System.out.println("Try Harder");
		else
			System.out.println("Sorry, you failed");

	}

}
