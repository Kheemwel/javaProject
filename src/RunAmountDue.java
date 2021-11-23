import java.util.Scanner;

public class RunAmountDue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmountDue due = new AmountDue();
        int input;

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - price only");
        System.out.println("2 - price and quantity");
        System.out.println("3 - price, quantity, and discount amount");
        input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("Amount due is " + due.computeAmountDue(sc.nextDouble()));
                break;
            case 2:
                System.out.println("Amount due is " + due.computeAmountDue(sc.nextDouble(), sc.nextDouble()));
                break;
            case 3:
                System.out.println("Amount due is " + due.computeAmountDue(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}
