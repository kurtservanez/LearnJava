package JavaBasic;

import java.util.Scanner;

public class sample {
	Scanner scan = new Scanner(System.in);

	private String user;
	private int passkey;
	private double balance;

	public sample(String user, int passkey, double balance) {
		this.user = user;
		this.passkey = passkey;
		this.balance = balance;
	}

	public void checkBalance() {
		System.out.println("Your current balance is " + balance);
	}

	public void deposit() {
		System.out.print("Enter deposit amount: ");
		int depositUser = scan.nextInt();
		balance += depositUser;
		checkBalance();
	}

	public void withdraw() {
		System.out.print("Enter withdraw amount: ");
		int withdrawUser = scan.nextInt();

		if (withdrawUser > balance) {
			System.out.println("Insufficient balance to withdraw. Try again!");
		} else {
			balance -= withdrawUser;
			checkBalance();
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int chose = 0;
		sample bank1 = new sample("asd", 12, 1000);

		System.out.print("Enter username: ");
		String userInput = scan.nextLine();

		System.out.print("Enter password: ");
		int passInput = scan.nextInt();

		if (userInput.equals(bank1.user) && passInput == bank1.passkey) {
			System.out.println("Welcome " + bank1.user);

			while (chose != 4) {
				System.out.println();

				System.out.println("Choose 1,2,3,4");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Exit");
				System.out.print("Choose: ");
				chose = scan.nextInt();

				switch (chose) {
				case 1:
					bank1.checkBalance();
					break;

				case 2:
					bank1.deposit();
					break;

				case 3:
					bank1.withdraw();
					break;

				case 4:
					System.out.println("Exiting...");
					break;

				default:
					System.out.println("ERROR TRY AGAIN!");
				}

			}
		} else
			System.out.println("ERROR");

	}
}
