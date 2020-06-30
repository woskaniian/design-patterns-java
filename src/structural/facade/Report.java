package structural.facade;

public class Report {
    private String title;
    private String content;
    private ReportType reportType;

    public Report(String title, String content, ReportType reportType) {
        this.title = title;
        this.content = content;
        this.reportType = reportType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", reportType=" + reportType +
                '}';
    }
}
