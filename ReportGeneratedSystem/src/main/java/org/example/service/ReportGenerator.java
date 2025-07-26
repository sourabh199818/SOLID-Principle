package org.example.service;

import org.example.model.Employee;

public interface ReportGenerator {

    //follwing LSP   (Liskov Substitution Principle) AND  SRP (Single Responsibility Principle)
    public  void printReport(Employee employee);
}
