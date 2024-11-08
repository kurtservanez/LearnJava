package JavaBasicFundamentals;

import java.util.Scanner;

public class VowelChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an alphabet: ");
		char alphabet = scan.next().charAt(0);

		if (alphabet >= 65 && alphabet <= 90 || alphabet >= 97 && alphabet <= 122) {

			if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
				System.out.println("This is a variable");

			else if (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')
				System.out.println("This is a variable");

			else
				System.out.println("This is a consonant");

		}

		else
			System.out.println("This is not an alphabet");

	}

}
