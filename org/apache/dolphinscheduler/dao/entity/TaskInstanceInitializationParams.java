package org.apache.dolphinscheduler.dao.entity;

import java.util.Date;

public class TaskInstanceInitializationParams {
    private String host;
    private Date startTime;
    private String executePath;

    public TaskInstanceInitializationParams(String host, Date startTime, String executePath) {
        this.host = host;
        this.startTime = startTime;
        this.executePath = executePath;
    }

    // getters and setters
}