package JavaBasicFundamentals;

import java.util.Scanner;

public class Raffle {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int participants;
		int winner;
		char again;

		do {

			System.out.print("Enter number of participants: ");
			participants = scan.nextInt();

			System.out.print("Enter of how may u want to win: ");
			winner = scan.nextInt();

			System.out.println("The Winners are:");

			for (int i = 1; i <= winner; i++) {

				int win = (int) (Math.random() * participants);

				System.out.println(i + " Participant: #" + win);
			}

			System.out.print("You want to re-ruffle? (y/n): ");
			again = scan.next().charAt(0);

		} while (again == 'y' || again == 'Y');

	}
}
