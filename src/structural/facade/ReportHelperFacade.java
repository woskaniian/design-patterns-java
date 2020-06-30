package structural.facade;

public class ReportHelperFacade {
    public static Report generateReport(String title, String content, ReportType reportType) {
        switch (reportType) {
            case First:
                return FirstTypeReportGenerator.generateReport(title, content);
            case Second:
                return SecondTypeReportGenerator.generateReport(title, content);
            default:
                return null;
        }
    }

    public static void printReport(Report report, ReportFormat reportFormat) {
        ReportPrinter.print(report, reportFormat);
    }
}
