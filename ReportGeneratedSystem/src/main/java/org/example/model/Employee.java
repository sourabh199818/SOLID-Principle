package org.example.model;

public class Employee {

    private String employeeName;
    private String mobileNumber;
    private int reportNumber;
    private String department;

    public Employee(String employeeName, String mobileNUmber, int reportNumber, String department) {
        this.employeeName = employeeName;
        this.mobileNumber = mobileNUmber;
        this.reportNumber = reportNumber;
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMobileNUmber() {
        return mobileNumber;
    }

    public void setMobileNUmber(String mobileNUmber) {
        this.mobileNumber = mobileNUmber;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
