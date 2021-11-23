import java.util.Scanner;

class SavingsAccount {
    public static double interestRate = 0; //step 4
    private double balance; //step 4

    public SavingsAccount() {
        balance = 0; //step 5
    }

    public static double getInterestRate() { //step 7
        return interestRate;
    }

    public static void setInterestRate(double newRate) { //step 6
        interestRate = newRate;
    }

    public static void showBalance(SavingsAccount account) { //step 11
        System.out.println("Your balance is " + account.getBalance());
    }

    public double getBalance() { //step 7
        return balance;
    }

    public void deposit(double amount) {  //step 8
        balance += amount;
    }

    public double withdraw(double amount) { //step 9
        if (balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return amount;
    }

    public void addInterest() { //step 10
        double interest = getBalance() * getInterestRate();
        balance += interest;
    }

}

public class RunSavingsAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        String decision;
        double interest_amount, deposit_amount;
        boolean loop = true; //set loop to false if you want to run the program once

        System.out.print("Enter interest rate: "); //step 13.a
        interest_amount = input.nextDouble();
        if (interest_amount >= 0) {
            SavingsAccount.setInterestRate(interest_amount);
            System.out.print("Enter deposit amount: "); //step 13.b
            deposit_amount = input.nextDouble();
            if (deposit_amount >= 0) {
                savings.deposit(deposit_amount);
                SavingsAccount.showBalance(savings);

                do {
                    System.out.print("Press D for another deposit or W to withdraw: "); //step 13.c
                    decision = input.next();
                    if (decision.equalsIgnoreCase("D")) {
                        System.out.print("Enter deposit amount: ");
                        deposit_amount = input.nextDouble();
                        if (deposit_amount >= 0) {
                            savings.deposit(deposit_amount);
                            if (savings.getBalance() >= 1000) {
                                savings.addInterest();
                                System.out.println("Interest Rate is " + SavingsAccount.getInterestRate());
                            }
                            System.out.println("Your new balance is " + savings.getBalance());
                        } else {
                            System.out.println("Invalid Input! Please repeat transaction");
                            loop = false;
                        }
                    } else if (decision.equalsIgnoreCase("W")) {
                        System.out.print("Enter withdraw amount: ");
                        if (savings.withdraw(input.nextDouble()) >= 0) {
                            System.out.println("Your new balance is " + savings.getBalance());
                        } else {
                            System.out.println("Invalid Input! Please repeat transaction");
                            loop = false;
                        }
                    } else {
                        System.out.println("Invalid Input! Please repeat transaction");
                        loop = false;
                    }
                } while (loop);
            } else {
                System.out.println("Invalid Input! Please repeat transaction");
            }
        } else {
            System.out.println("Invalid Input! Please repeat transaction");
        }
    }
}
