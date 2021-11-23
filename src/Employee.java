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
