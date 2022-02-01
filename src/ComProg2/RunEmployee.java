package ComProg2;

import java.util.Scanner;

class Employee {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setWage(double ratePerHour, int hoursWorked) {
        setRatePerHour(ratePerHour);
        setHoursWorked(hoursWorked);
        this.wage = getRatePerHour() * getHoursWorked();
    }

    public double getWage() {
        return wage;
    }
}

public class RunEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Press F for Full Time or P for Part Time: ");

        switch (input.nextLine().toUpperCase()) {
            case "F":
                FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
                fullTimeEmployee.setName(name);
                System.out.print("Enter monthly salary: ");
                fullTimeEmployee.setMonthlySalary(input.nextDouble());
                System.out.println();
                System.out.println("Name: " + fullTimeEmployee.getName());
                System.out.println("Monthly Salary: " + fullTimeEmployee.getMonthlySalary());
                break;
            case "P":
                PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
                partTimeEmployee.setName(name);
                System.out.println("Enter rate per hour and number of hours worked separated by space:");
                System.out.println("Sample: 107.50 13");
                partTimeEmployee.setWage(input.nextDouble(), input.nextInt());
                System.out.println("Name: " + partTimeEmployee.getName());
                System.out.println("Wage: " + partTimeEmployee.getWage());
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

