package LabExercise;

class Employees {
    public int salary;
}

class Manager extends Employees {
    public int budget;
}

public class Director extends Manager {
    public int stockOptions;

    public static void main(String[] args) {
        Employees employee = new Employees();
        Manager manager = new Manager();
        Director director = new Director();
        employee.salary = 50000;
        director.salary = 80000;
        manager.budget = 100000;
        director.stockOptions = 1000;
    }
}
