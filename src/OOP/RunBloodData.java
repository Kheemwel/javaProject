package OOP;

import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter blood type of patient: ");
            String input1 = sc.nextLine();
            boolean c1 = (input1.equals("O") || input1.equals("A") || input1.equals("B") || input1.equals("AB"));
            BloodData bd = new BloodData();
            if (input1.isEmpty() || c1) {
                System.out.print("Enter blood Rhesus Factor (+ or -): ");
                String input2 = sc.nextLine();
                boolean c2 = (input2.equals("+") || input2.equals("-"));
                if (input1.isEmpty() && input2.isEmpty()) {
                    bd.display();
                } else if (c1 && c2) {
                    bd.setBloodType(input1);
                    bd.setRhFactor(input2);
                    bd.display();
                } else {
                    System.out.println("Invalid Input!");
                    break;
                }
            } else {
                System.out.println("Invalid Input!");
                break;
            }
        }
    }

}

class BloodData {
    private String bloodType, rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bt) {
        bloodType = bt;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rh) {
        rhFactor = rh;
    }

    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}