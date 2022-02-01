package OOP.Draft;

import java.util.Scanner;

public class RunSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter interest rate:");
        savings.setInterestRate(scanner.nextDouble());

        System.out.print("Enter deposit amount:");
        savings.deposit(scanner.nextDouble());

        savings.showBalance(savings);

        System.out.print("Press D for another deposit or W to withdraw:");
        String userInput = scanner.next();

        if (userInput.equalsIgnoreCase("D")) {
            System.out.print("Enter deposit amount:");
            savings.deposit(scanner.nextDouble());
        } else if (userInput.equalsIgnoreCase("W")) {
            System.out.print("Enter withdraw amount:");
            savings.withdraw(scanner.nextDouble());
        } else {
            System.out.println("Invalid Input! Please repeat transaction");
        }

        if (savings.getBalance() > 1000) {
            savings.addInterest();
        }

        System.out.println("Your new balance is " + savings.getBalance());
    }
}

class SavingsAccount {
    public static double interestRate = 0;
    private double balance;

    public SavingsAccount() {
        balance = 0;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static void showBalance(SavingsAccount account) {
        System.out.println("Your Balance is " + account.getBalance());
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return amount;
    }

    public void addInterest() {
        double interest = getBalance() * getInterestRate();
        balance += interest;
    }
}
