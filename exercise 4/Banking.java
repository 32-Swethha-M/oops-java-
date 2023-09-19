/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking;

/**
 *
 * @author Swethha
 */
import java.util.Scanner;

abstract class Account {
    private int accno;
    private String name;
    private String email;
    protected double balance;

    public Account(int accno, String name, String email) {
        this.accno = accno;
        this.name = name;
        this.email = email;
        this.balance = 0.0;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
    public String toString() {
        return "Account Number: " + accno + "\nName: " + name + "\nEmail: " + email;
    }
}

class CurrentAccount extends Account {

    public CurrentAccount(int accno, String name, String email) {
        super(accno, name, email);
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double getbalance(double b){
    balance=b;
    System.out.println("balance:"+balance);
    return balance;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in the current account.");
        }
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(int accno, String name, String email) {
        super(accno, name, email);
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double getbalance(double b){
        balance=b;
        System.out.println("balance:"+balance);
        return balance;
        }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in the savings account.");
        }
    }
}

  public class Banking{
    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Current Account Details:");
        System.out.print("Account Number: ");
        int currentAccountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String currentAccountName = scanner.nextLine();
        System.out.print("Email: ");
        String currentAccountEmail = scanner.nextLine();

        CurrentAccount current = new CurrentAccount(currentAccountNumber, currentAccountName, currentAccountEmail);

        System.out.println("\nEnter Savings Account Details:");
        System.out.print("Account Number: ");
        int savingsAccountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String savingsAccountName = scanner.nextLine();
        System.out.print("Email: ");
        String savingsAccountEmail = scanner.nextLine();

        SavingsAccount savings = new SavingsAccount(savingsAccountNumber, savingsAccountName, savingsAccountEmail);

        System.out.print("\nEnter amount to deposit into Current Account: $");
        double currentDepositAmount = scanner.nextDouble();
        current.deposit(currentDepositAmount);

        System.out.print("Enter amount to deposit into Savings Account: $");
        double savingsDepositAmount = scanner.nextDouble();
        savings.deposit(savingsDepositAmount);

        System.out.print("Enter amount to withdraw from Current Account: $");
        double currentWithdrawAmount = scanner.nextDouble();
        current.withdraw(currentWithdrawAmount);

        System.out.print("Enter amount to withdraw from Savings Account: $");
        double savingsWithdrawAmount = scanner.nextDouble();
        savings.withdraw(savingsWithdrawAmount);

        System.out.println("\nUpdated Account Balances:");
        System.out.println("Current Account Balance: $" + current.balance);
        System.out.println("Savings Account Balance: $" + savings.balance);

        scanner.close();
    }
}