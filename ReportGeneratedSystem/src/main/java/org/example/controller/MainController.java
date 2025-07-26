package org.example.controller;

import org.example.model.Employee;
import org.example.service.ReportGenerator;

public class MainController {

//  Following  SRP (Single Responsibility Principle)
  private ReportGenerator reportGenerator;


   public MainController(ReportGenerator reportGenerator)
   {
       this.reportGenerator= reportGenerator;

   }


   public void generateReport(Employee employee)
   {
       reportGenerator.printReport(employee);
   }

    public MainController() {
    }
}
