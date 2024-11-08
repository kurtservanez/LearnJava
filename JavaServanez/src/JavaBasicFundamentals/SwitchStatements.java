package JavaBasicFundamentals;

import java.util.Scanner;

public class SwitchStatements {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double b = 5.00;
		double p = 7.00;
		double c = 1.50;
		double w = 1.00;

		String dish1 = "Burger";
		String dish2 = "Pizza";
		String dish3 = "Coke";
		String dish4 = "Water";

		System.out.println("Welcome to Our Restaurant!");
		System.out.println("Please choose a dish:");

		System.out.println("1. " + dish1 + " - $" + b + "0");
		System.out.println("2. " + dish2 + " - $" + p + "0");
		System.out.println("3. " + dish3 + " - $" + c + "0");
		System.out.println("4. " + dish4 + " - $" + w + "0");
		System.out.println("5. Exit");

		System.out.print("Enter your choice (1-5): ");
		int choice = scan.nextInt();

		System.out.println();

		switch (choice) {
		case 1:
			System.out.println("You chose " + dish1 + "." + " The price is" + " $" + b + "0");
			break;
		case 2:
			System.out.println("You chose " + dish2 + "." + " The price is" + " $" + p + "0");
			break;
		case 3:
			System.out.println("You chose " + dish3 + "." + " The price is" + " $" + c + "0");
			break;
		case 4:
			System.out.println("You chose " + dish4 + "." + " The price is" + " $" + w + "0");
			break;
		case 5:
			System.out.println("");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
