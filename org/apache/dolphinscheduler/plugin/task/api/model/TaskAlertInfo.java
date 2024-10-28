public class TaskAlertInfo {
    private String title;
    private String content;
    private Integer alertGroupId;

    public TaskAlertInfo(String title, String content, Integer alertGroupId) {
        this.title = title;
        this.content = content;
        this.alertGroupId = alertGroupId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getAlertGroupId() {
        return alertGroupId;
    }
}