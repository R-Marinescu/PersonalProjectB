package model;

import java.util.Date;

public class Student {
    String SFName;
    String SLName;
    int student_Id;
    Date DOB;

    public Student() {
    }

    public String getSFName() {
        return SFName;
    }

    public void setSFName(String SFName) {
        this.SFName = SFName;
    }

    public String getSLName() {
        return SLName;
    }

    public void setSLName(String SLName) {
        this.SLName = SLName;
    }

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Student(String SFName, String SLName, int student_Id, Date DOB) {
        this.SFName = SFName;
        this.SLName = SLName;
        this.student_Id = student_Id;
        this.DOB = DOB;
    }

}