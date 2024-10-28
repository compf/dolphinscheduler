package org.apache.dolphinscheduler.api.test.entity;

import org.apache.dolphinscheduler.dao.entity.User;

public class ExecutionTaskRequest {
    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private String startNodeList;

    // Constructors, getters and setters
}