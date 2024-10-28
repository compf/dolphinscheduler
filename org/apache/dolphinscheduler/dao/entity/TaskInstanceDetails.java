
package org.apache.dolphinscheduler.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class TaskInstanceDetails implements Serializable {

    private String name;
    private Long projectCode;
    private String host;
    private Date startTime;

    public TaskInstanceDetails(String name, Long projectCode, String host, Date startTime) {
        this.name = name;
        this.projectCode = projectCode;
        this.host = host;
        this.startTime = startTime;
    }

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}