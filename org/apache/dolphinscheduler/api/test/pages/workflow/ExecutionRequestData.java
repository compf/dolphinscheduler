package org.apache.dolphinscheduler.api.test.pages.workflow;

import org.apache.dolphinscheduler.api.enums.ExecuteType;
import org.apache.dolphinscheduler.dao.entity.User;

public class ExecutionRequestData {
    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private ExecuteType executeType;

    public ExecutionRequestData(User loginUser, long projectCode, int workflowInstanceId, ExecuteType executeType) {
        this.loginUser = loginUser;
        this.projectCode = projectCode;
        this.workflowInstanceId = workflowInstanceId;
        this.executeType = executeType;
    }

    public User getLoginUser() {
        return loginUser;
    }

    public long getProjectCode() {
        return projectCode;
    }

    public int getWorkflowInstanceId() {
        return workflowInstanceId;
    }

    public ExecuteType getExecuteType() {
        return executeType;
    }
}