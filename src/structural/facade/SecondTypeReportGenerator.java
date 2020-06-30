package structural.facade;

public class SecondTypeReportGenerator {
    public static Report generateReport(String title, String content) {
        return new Report(title, content, ReportType.Second);
    }
}
