package JavaBasicFundamentals;

import java.util.Scanner;

public class BinaryDecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1.Decimal to binary");
		System.out.println("2.Binary to decimal");

		System.out.print("Choose : ");
		int chose = scan.nextInt();

		System.out.println();

		switch (chose) {
		case 1:

			System.out.println("Enter the number that you want converted to binary: ");
			int decimal1 = scan.nextInt();
			String binary1 = Integer.toBinaryString(decimal1);
			System.out.println("Result : " + binary1);

			break;

		case 2:
			System.out.println("Enter the binary that you want converted to decimal: ");
			String binary2 = scan.nextLine();
			int decimal2 = Integer.parseInt(binary2, 2);
			System.out.println("result : " + decimal2);

			break;

		default:
			System.out.println("Invalid input");
		}

	}
}
