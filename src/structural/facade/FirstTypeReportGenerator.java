package structural.facade;

public class FirstTypeReportGenerator {
    public static Report generateReport(String title, String content) {
        return new Report(title, content, ReportType.First);
    }
}
