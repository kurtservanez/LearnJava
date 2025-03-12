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

public class Bank {

    Scanner scan = new Scanner(System.in);
    private String name;
    private int password;
    private double balance;

    public Bank(String name, int password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Your current balance now is: " + balance);
    }

    public void depositAmount() {
        System.out.print("Deposit Amount: ");
        double deposit = scan.nextDouble();
        balance += deposit;
        System.out.println("");
        checkBalance();
    }

    public void withdrawAmount() {
        System.out.print("Withdraw Amount: ");
        double withdraw = scan.nextDouble();

        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawal successful!");
            checkBalance();

        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }

    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

}
