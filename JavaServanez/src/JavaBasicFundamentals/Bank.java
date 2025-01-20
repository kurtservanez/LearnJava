package JavaBasicFundamentals;

import java.util.Scanner;

public class Bank {
	Scanner scan = new Scanner(System.in);

	int balance;
	int pin;

	public void acc1() {
		pin = 1234;
		balance = 1000;

	}

	public void acc2() {
		pin = 5678;
		balance = 500;

	}

	public void balance() {
		System.out.println("Your current balance is: " + balance);

	}

	public void deposit() {
		System.out.print("Enter amount: ");
		double amount = scan.nextInt();
		balance += amount;
		balance();

	}

	public void withdraw() {
		System.out.print("Enter amount: ");
		double amount = scan.nextInt();
		if (amount <= balance) {
			balance -= amount;
			balance();
		} else
			System.out.println("Invalid withdraw");

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pin;
		Bank acc1 = new Bank();
		Bank acc2 = new Bank();

		acc1.acc1();
		acc2.acc2();

		System.out.print("Enter PIN: ");
		pin = scan.nextInt();

		if (pin == acc1.pin) {
			while (true) {
				System.out.println();
				System.out.println("A. Check Balance");
				System.out.println("B. Deposit");
				System.out.println("C. Withdraw");
				System.out.print("Choose (A,B,C or X for exit): ");
				char choose = scan.next().charAt(0);

				if (choose == 'X')
					break;
				System.out.println();

				switch (choose) {
				case 'A':
					acc1.balance();
					break;

				case 'B':
					acc1.deposit();
					break;

				case 'C':
					acc1.withdraw();
					break;

				default:
					System.out.println("Invalid option, Try again!");
					break;
				}

			}

		}

		else if (pin == acc2.pin) {
			while (true) {
				System.out.println();
				System.out.println("A. Check Balance");
				System.out.println("B. Deposit");
				System.out.println("C. Withdraw");
				System.out.print("Choose (A,B,C or X for exit): ");
				char choose = scan.next().charAt(0);

				if (choose == 'X')
					break;
				System.out.println();

				switch (choose) {
				case 'A':
					acc2.balance();
					break;

				case 'B':
					acc2.deposit();
					break;

				case 'C':
					acc2.withdraw();
					break;

				default:
					System.out.println("Invalid option, Try again!");
					break;
				}

			}

		} else
			System.out.println("Invalid pin no account!");

	}

}
