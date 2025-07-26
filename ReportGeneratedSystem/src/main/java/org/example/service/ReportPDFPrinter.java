package org.example.service;

import org.example.model.Employee;

public class ReportPDFPrinter implements ReportGenerator {


    @Override
    public void printReport(Employee emp)
    {
        System.out.println("PDF Report:\nName: " + emp.getEmployeeName() + "\nDept: " + emp.getDepartment());
    }


}
