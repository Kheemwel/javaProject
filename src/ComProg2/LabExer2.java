package ComProg2;

import java.util.Scanner;

public class LabExer2 {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;

    public static void main(String[] args) {
        LabExer2 labExer2 = new LabExer2();

        System.out.println("Enter the name of the item you are purchasing.");
        labExer2.readInput();
        System.out.println("Enter the quantity and price separated by a space.");
        labExer2.readInput();
        labExer2.writeOutput();
        System.out.println("Amount due is " + labExer2.getTotalCost());
    }

    public void readInput() {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            setTotalCost(s.nextInt(), s.nextDouble());
        } else {
            setItemName(s.nextLine());
        }
    }

    public void writeOutput() {
        System.out.println("You are purchasing " + itemQuantity + " " + getItemName() + "(s) at " + itemPrice + " each.");
    }

    public double getTotalCost() {
        return amountDue;
    }

    public void setTotalCost(int quantity, double price) {
        itemQuantity = quantity;
        itemPrice = price;
        amountDue = itemQuantity * itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String newItemName) {
        itemName = newItemName;
    }
}
