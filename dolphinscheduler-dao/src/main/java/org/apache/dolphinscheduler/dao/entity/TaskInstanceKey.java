package org.apache.dolphinscheduler.dao.entity;

public class TaskInstanceKey {

    private String name;
    private Long projectCode;
    private String host;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    // Additional functionality can be added here as needed
}
