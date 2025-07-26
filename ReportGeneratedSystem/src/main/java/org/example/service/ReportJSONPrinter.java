package org.example.service;

import org.example.model.Employee;

public class ReportJSONPrinter implements  ReportGenerator{

    @Override
    public void printReport(Employee emp) {
        System.out.println("JSON Report:\nName: " + emp.getEmployeeName() + "\nDept: " + emp.getDepartment());
    }
}
