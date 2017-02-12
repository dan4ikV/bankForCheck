package ua.smartprog.bankProject;

import java.util.MissingFormatArgumentException;

public class Consulter extends Employee {
    private int experience;
    private int myID;

    public Consulter() {
        experience  = 4;
        setSalary(1000);
        myID = id + 1;
        id = id;
        //new commit
    }

    public Consulter(int experience) {
        this.experience = experience;
        setSalary(1000);
        myID += id;
        id += id;
    }

    public Consulter(String fName, String sName, int cAge, int ID, int Sal) {
        super();
        this.experience = 4;
        setSalary(1000);
        myID += id;
        id += id;
    }
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getMyID (){
        System.out.println(myID);
        return myID;
    }
}
