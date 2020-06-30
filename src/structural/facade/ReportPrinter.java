package structural.facade;

public class ReportPrinter {
    public static void print(Report report, ReportFormat reportFormat) {
        System.out.println("Printing report in format " + reportFormat);
        System.out.println(report);
    }
}
