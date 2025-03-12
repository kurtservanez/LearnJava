/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankPackage;

/**
 *
 * @author raini
 */
import java.util.Scanner;

public class BankManagement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Bank bank1 = new Bank("Alpha", 1234, 1000);
        Bank bank2 = new Bank("Bravo", 4321, 3000);

        for (int i = 3; i > -1; i--) {
            System.out.print("Enter name: ");
            String bankName = scan.next();

            System.out.print("Enter passcode: ");
            int passcode = scan.nextInt();

            if (bankName.equals(bank1.getName()) && passcode == bank1.getPassword()) {
                System.out.println("Welcome " + bank1.getName());
                while (true) {
                    System.out.println("");
                    System.out.println("Choose 1,2,3,4:");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.print("Choose: ");
                    int chose = scan.nextInt();

                    switch (chose) {
                        case 1:
                            bank1.checkBalance();
                            break;

                        case 2:
                            bank1.depositAmount();
                            break;

                        case 3:
                            bank1.withdrawAmount();
                            break;

                        case 4:
                            System.out.println("Exiting...");
                            break;

                        default:
                            System.out.println("Error, try again!");
                    }
                    if (chose == 4) {
                        break;
                    }
                }
            } else if (bankName.equals(bank2.getName()) && passcode == bank2.getPassword()) {
                System.out.println("Welcome " + bank2.getName());
                while (true) {
                    System.out.println("");
                    System.out.println("Choose 1,2,3,4:");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.print("Choose: ");
                    int chose = scan.nextInt();

                    switch (chose) {
                        case 1:
                            bank2.checkBalance();
                            break;

                        case 2:
                            bank2.depositAmount();
                            break;

                        case 3:
                            bank2.withdrawAmount();
                            break;

                        case 4:
                            System.out.println("Exiting...");
                            break;

                        default:
                            System.out.println("Error");
                    }
                    if (chose == 4) {
                        break;
                    }
                }
            } else {
                if (i == 0) {
                    System.out.println("Too many failed attempts. Exiting...");
                } else {
                    System.out.println("Incorrect name or password. Please try again (" + i + " attempts remaining).");
                }
            }
        }

    }

}
