package org.example.service;

public class ReportFactory {

    //following OCP (Open/Closed Principle)
    public static ReportGenerator getReportGenerator(String type) {
        return switch (type.toLowerCase()) {
            case "pdf" -> new ReportPDFPrinter();
            case "json" -> new ReportJSONPrinter();
            default -> throw new IllegalArgumentException("Unknown report type");
        };
    }
}
