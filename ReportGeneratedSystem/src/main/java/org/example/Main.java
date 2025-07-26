package org.example;

import org.example.controller.MainController;
import org.example.model.Employee;
import org.example.service.ReportFactory;
import org.example.service.ReportGenerator;

public class Main {
    public static void main(String[] args) {
//        Following Dependency Inversion
        ReportGenerator reportGenPdf = ReportFactory.getReportGenerator("pdf");
        MainController controller = new MainController(reportGenPdf);
        controller.generateReport(new Employee("Sourabh", "9876543210", 1, "Engineering"));

        ReportGenerator reportGenCSV = ReportFactory.getReportGenerator("json");
        MainController controller1 = new MainController(reportGenCSV);
        controller1.generateReport(new Employee("Abhinav", "9876543210", 1, "Commerce"));

    }
}