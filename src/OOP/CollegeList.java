package OOP;

import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String prompt = input.nextLine();
        switch (prompt.toUpperCase()) {
            case "E":
                Employee employee = new Employee();
                System.out.println("Type employee's name, contact number, salary, and department.");
                System.out.println("Press Enter after every input.");
                employee.setName(input.nextLine());
                employee.setContactNum(input.nextLine());
                employee.setSalary(Double.parseDouble(input.nextLine()));
                employee.setDepartment(input.nextLine());
                System.out.println("----------------------------------------------------------------");
                System.out.println("Name: " + employee.getName());
                System.out.println("Contact Number: " + employee.getContactNum());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("Department: " + employee.getDepartment());
                break;
            case "F":
                Faculty faculty = new Faculty();
                System.out.println("Type faculty member's name, contact number, salary, and department.");
                System.out.println("Press Enter after every input.");
                faculty.setName(input.nextLine());
                faculty.setContactNum(input.nextLine());
                faculty.setSalary(Double.parseDouble(input.nextLine()));
                faculty.setDepartment(input.nextLine());
                System.out.print("Press Y if you are regular/tenured or N if not: ");
                String status = input.nextLine();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Name: " + faculty.getName());
                System.out.println("Contact Number: " + faculty.getContactNum());
                System.out.println("Salary: " + faculty.getSalary());
                System.out.println("Department: " + faculty.getDepartment());
                switch (status.toUpperCase()) {
                    case "Y":
                        if (!faculty.isRegular()) {
                            System.out.println("Status: Regular");
                        }
                        break;
                    case "N":
                        if (!faculty.isRegular()) {
                            System.out.println("Status: Irregular");
                        }
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
                break;
            case "S":
                Student student = new Student();
                System.out.println("Type student's name, contact number, program, and year level.");
                System.out.println("Press Enter after every input.");
                student.setName(input.nextLine());
                student.setContactNum(input.nextLine());
                student.setProgram(input.nextLine());
                student.setYearLevel(Integer.parseInt(input.nextLine()));
                System.out.println("----------------------------------------------------------------");
                System.out.println("Name: " + student.getName());
                System.out.println("Contact Number: " + student.getContactNum());
                System.out.println("Program: " + student.getProgram());
                System.out.println("Year level: " + student.getYearLevel());
                break;
            default:
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
