package org.apache.dolphinscheduler.api.test.model;

import org.apache.dolphinscheduler.api.enums.ExecuteType;
import org.apache.dolphinscheduler.dao.entity.User;

public class ExecutionRequest {

    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private ExecuteType executeType;

    // Constructor, Getters and Setters
}