package JavaBasicFundamentals;

import java.util.Scanner;

public class TaskSolving {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("===RAFFLE DRAW===");
		int w;
		int participants = 10;
		int winner;
		char playAgain;
		 
		
		do {
			System.out.print("Enter the number of winners to draw (1-5): ");
			w = scan.nextInt();
			
			
			
			System.out.println("Congratulations to the winners :");
			
		
		for (int i = 1; i <= w; i++) {
			
			winner = (int)(Math.random() * participants);
			System.out.println(i + ". Participant " + winner);
			
			
		}
		System.out.print("Would you like to draw again? (y/n): ");
        playAgain = scan.next().charAt(0);
			
			
		}while(playAgain == 'y' || playAgain == 'Y');
		if (playAgain == 'n' || playAgain == 'N')
			System.out.println("Thank u!");
		
	
		
	}

}
