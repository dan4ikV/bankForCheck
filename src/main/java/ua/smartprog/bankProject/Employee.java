package ua.smartprog.bankProject;

public class Employee extends Human {
    static int id;
    private int salary;
    private int workDays;

    public Employee() {
        salary = 0;
        workDays = 0;
    }
    //start 2001
    public Employee(String fName, String sName, int cAge, int Sal) {
        super(fName, sName, cAge);
        salary = Sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
}
