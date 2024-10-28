package org.apache.dolphinscheduler.dao.model;

public class TaskInstanceDetails {

    private String name;
    private Long projectCode;
    private String host;

    public TaskInstanceDetails(String name, Long projectCode, String host) {
        this.name = name;
        this.projectCode = projectCode;
        this.host = host;
    }

    public String getName() {
        return name;
    }

    public Long getProjectCode() {
        return projectCode;
    }

    public String getHost() {
        return host;
    }

}