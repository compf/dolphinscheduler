package org.apache.dolphinscheduler.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class TaskInstanceDetails implements Serializable {

    private String host;
    private Date startTime;
    // other fields and methods

    public TaskInstanceDetails(String host, Date startTime) {
        this.host = host;
        this.startTime = startTime;
    }

    // Getters and setters
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