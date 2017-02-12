package ua.smartprog.bankProject;

import java.util.Random;

public class Officer extends Employee {
    private int WorkplaceNumber;
    Random random = new Random();
    private int myID;

    public Officer() {
        WorkplaceNumber = random.nextInt(300) + 1;
        setSalary(2000);
        myID += id;
        id += id;
    }

    public Officer(int workplaceNumber) {
        WorkplaceNumber = workplaceNumber;
        setSalary(2000);
        myID += id;
        id += id;
    }

    public Officer(String fName, String sName, int cAge, int ID, int Sal, int workplaceNumber) {
        super();
        WorkplaceNumber = workplaceNumber;
        setSalary(2000);
    }
    public int getMyID (){
        System.out.println(myID);
        return myID;
    }
}