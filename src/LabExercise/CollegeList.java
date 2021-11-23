package LabExercise;

import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String press = sc.nextLine();
        if (press.equalsIgnoreCase("E")) {
            Employee e = new Employee();
            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.println("Press Enter after every sc.");
            e.setName(sc.nextLine());
            e.setContactNum(sc.nextLine());
            e.setSalary(Double.parseDouble(sc.nextLine()));
            e.setDepartment(sc.nextLine());
            System.out.println("----------------------------------------------------------------");
            System.out.println("Name: " + e.getName());
            System.out.println("Contact Number: " + e.getContactNum());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Department: " + e.getDepartment());
        } else if (press.equalsIgnoreCase("F")) {
            Faculty f = new Faculty();
            System.out.println("Type faculty member's name, contact number, salary, and department.");
            System.out.println("Press Enter after every sc.");
            f.setName(sc.nextLine());
            f.setContactNum(sc.nextLine());
            f.setSalary(Double.parseDouble(sc.nextLine()));
            f.setDepartment(sc.nextLine());
            System.out.print("Press Y if you are regular/tenured or N if not: ");
            String status = sc.nextLine();
            System.out.println("----------------------------------------------------------------");
            System.out.println("Name: " + f.getName());
            System.out.println("Contact Number: " + f.getContactNum());
            System.out.println("Salary: " + f.getSalary());
            System.out.println("Department: " + f.getDepartment());
            if (status.equalsIgnoreCase("Y")) {
                boolean regular = f.isRegular(); //since the value of status is not declared, the default value is false
                if (!regular) {
                    System.out.println("Status: Regular");
                } else {
                    System.out.println("Status: Not Regular");
                }
            } else if (status.equalsIgnoreCase("N")) {
                System.out.println("Status: Not Regular");
            } else {
                System.out.println("Invalid Input!");
            }
        } else if (press.equalsIgnoreCase("S")) {
            Student s = new Student();
            System.out.println("Type student's name, contact number, program, and year level.");
            System.out.println("Press Enter after every sc.");
            s.setName(sc.nextLine());
            s.setContactNum(sc.nextLine());
            s.setProgram(sc.nextLine());
            s.setYearLevel(Integer.parseInt(sc.nextLine()));
            System.out.println("----------------------------------------------------------------");
            System.out.println("Name: " + s.getName());
            System.out.println("Contact Number: " + s.getContactNum());
            System.out.println("Program: " + s.getProgram());
            System.out.println("Year level: " + s.getYearLevel());
        } else {
            System.out.println("Invalid Input!");
        }
    }
}

class Person {
    private String name;
    private String contactNum;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String c) {
        contactNum = c;
    }
}

class Employee extends Person {
    private double salary;
    private String department;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String d) {
        department = d;
    }
}

class Faculty extends Employee {
    private boolean status;

    public boolean isRegular() {
        return status;
    }
}

class Student extends Person {
    private String program;
    private int yearLevel;

    public String getProgram() {
        return program;
    }

    public void setProgram(String p) {
        program = p;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int y) {
        yearLevel = y;
    }
}
