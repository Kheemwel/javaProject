package SampleCodes.ComProg2AndOOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend, divisor, quotient;

        try {
            System.out.print("Enter dividend: ");
            dividend = sc.nextInt();
            System.out.print("Enter divisor: ");
            divisor = sc.nextInt();
            quotient = dividend / divisor;
            System.out.println(dividend + "/" + divisor + " = " + quotient);
        } catch (ArithmeticException ex) {
            System.out.println("Divisor cannot be 0.");
            System.out.println("Try again.");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid data type.");
            System.out.println("Please enter an integer.");
        } finally {
            System.out.println("Thank you for your time.");
        }
    }
}

class HighBalanceException extends Exception {
    public HighBalanceException() {
        super("Customer balance is higher than the credit limit.");
    }
}

class CustomerAccount {
    public static double HIGH_CREDIT_LIMIT = 30000.00;
    private Scanner s = new Scanner(System.in);
    private int acctNum;
    private double bal;

    public static void main(String[] args) {
        CustomerAccount c = new CustomerAccount();
        c.input();
    }

    public void input() {
        try {
            System.out.print("Enter account number: ");
            acctNum = s.nextInt();
            System.out.print("Enter balance due: ");
            bal = s.nextDouble();
            if (bal > HIGH_CREDIT_LIMIT) {
                throw new HighBalanceException();
            }
        } catch (HighBalanceException hbe) {
            System.out.println(hbe.getMessage());
        }
    }
}
