package JavaBasicFundamentals;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("A. Basic Calculator");
		System.out.println("B. Scientific Calculator");

		System.out.print("Choose A/B: ");
		char chose1 = scan.next().charAt(0);

		if (chose1 == 'a' || chose1 == 'b')
			System.out.println("Make it capital letter");

		else if (chose1 != 'A' && chose1 != 'B')
			System.out.println("Invalid Input");

		System.out.println();

		switch (chose1) {

		case 'A':
			System.out.println("CHOOSE OPERATION");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");

			System.out.print("Choose operation: ");
			int chose2 = scan.nextInt();

			switch (chose2) {

			case 1:
				System.out.print("Enter num1: ");
				int num1A = scan.nextInt();
				System.out.print("Enter num2: ");
				int num2A = scan.nextInt();
				System.out.println("Result: " + (num1A + num2A));
				break;

			case 2:
				System.out.print("Enter num1: ");
				int num1B = scan.nextInt();
				System.out.print("Enter num2: ");
				int num2B = scan.nextInt();
				System.out.println("Result: " + (num1B - num2B));
				break;

			case 3:
				System.out.print("Enter num1: ");
				int num1C = scan.nextInt();
				System.out.print("Enter num2: ");
				int num2C = scan.nextInt();
				System.out.println("Result: " + (num1C * num2C));
				break;

			case 4:
				System.out.print("Enter num1: ");
				int num1D = scan.nextInt();
				System.out.print("Enter num2: ");
				int num2D = scan.nextInt();
				if (num2D != 0)
					System.out.println("Result: " + (num1D / num2D));
				else
					System.out.println("Error: Division by zero is not allowed!");
				break;

			default:
				System.out.println("Invalid Input");
			}

		case 'B':
			System.out.println("CHOOSE");
			System.out.println("1. Square Root");
			System.out.println("2. Exponent");
			System.out.println("3. Log");
			System.out.println("4. Log10");
			System.out.println("5. Trigonometric Calculations");

			System.out.print("Choose operation: ");
			int chose3 = scan.nextInt();

			switch (chose3) {

			case 1:
				System.out.print("Enter num that you want to square root: ");
				int num1E = scan.nextInt();
				System.out.println("The square root of " + num1E + " is = " + Math.sqrt(num1E));
				break;

			case 2:
				System.out.print("Enter number: ");
				int num1F = scan.nextInt();

				System.out.print("Enter exponent: ");
				int num2F = scan.nextInt();

				System.out.println("Result: " + Math.pow(num1F, num2F));
				break;

			case 3:
				System.out.print("Enter number: ");
				int num1L = scan.nextInt();

				System.out.println("Result: " + Math.log(num1L));
				break;

			case 4:
				System.out.print("Enter number: ");
				int num10L = scan.nextInt();

				System.out.println("Result: " + Math.log10(num10L));
				break;

			case 5:

				System.out.println("Choose: Trigonometric Calculations");
				System.out.println("1. Sine");
				System.out.println("2. Cosine");
				System.out.println("3. Tangent");
				System.out.print("Chose: ");
				int chose4 = scan.nextInt();

				switch (chose4) {

				case 1:
					System.out.print("Enter angle: ");
					double angleDegrees = scan.nextInt();
					double angleRadians = Math.toRadians(angleDegrees);
					double sineValue = Math.sin(angleRadians);
					System.out.println("The sine of " + angleDegrees + " is " + sineValue);
					break;

				case 2:
					System.out.print("Enter angle: ");
					double angleDegrees1 = scan.nextInt();
					double angleRadians1 = Math.toRadians(angleDegrees1);
					double cosValue1 = Math.cos(angleRadians1);
					System.out.println("The cosine of " + angleDegrees1 + " is " + cosValue1);
					break;

				case 3:
					System.out.print("Enter angle: ");
					double angleDegrees2 = scan.nextInt();
					double angleRadians2 = Math.toRadians(angleDegrees2);
					double tanValue2 = Math.tan(angleRadians2);
					System.out.println("The tangent of " + angleDegrees2 + " is " + tanValue2);
					break;

				default:
					System.out.println("Invalid Input");
					break;

				}
			default:
				System.out.println("Invalid Input");
			}

		}

	}

}
