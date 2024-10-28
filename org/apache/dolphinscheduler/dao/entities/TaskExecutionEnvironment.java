package org.apache.dolphinscheduler.dao.entities;

import java.util.Date;

public class TaskExecutionEnvironment {

    private String host;
    private Date startTime;
    private String executePath;

    public TaskExecutionEnvironment(String host, Date startTime, String executePath) {
        this.host = host;
        this.startTime = startTime;
        this.executePath = executePath;
    }

    public String getHost() {
        return host;
    }

    public Date getStartTime() {
        return startTime;
    }

    public String getExecutePath() {
        return executePath;
    }
}