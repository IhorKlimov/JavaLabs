package com.company;

import java.util.Date;

public class CuratorJournalEntry {
    private String studentLastName;
    private String studentFirstName;
    private Date studentBirthDate;
    private String studentPhoneNumber;
    private String studentAddress;

    public CuratorJournalEntry(String studentLastName, String studentFirstName, Date studentBirthDate, String studentPhoneNumber, String studentAddress) {
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.studentBirthDate = studentBirthDate;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentAddress = studentAddress;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public Date getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(Date studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "studentLastName='" + studentLastName + '\'' +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentBirthDate=" + studentBirthDate +
                ", studentPhoneNumber='" + studentPhoneNumber + '\'' +
                ", studentAddress='" + studentAddress + '\'';
    }
}
