package org.apache.dolphinscheduler.api.test.pages.workflow;

import org.apache.dolphinscheduler.common.enums.TaskDependType;
import org.apache.dolphinscheduler.dao.entity.User;

public class TaskExecutionRequest {
    private User loginUser;
    private long workflowInstanceId;
    private String startNodeList;
    private TaskDependType taskDependType;

    public TaskExecutionRequest(User loginUser, long workflowInstanceId, String startNodeList, TaskDependType taskDependType) {
        this.loginUser = loginUser;
        this.workflowInstanceId = workflowInstanceId;
        this.startNodeList = startNodeList;
        this.taskDependType = taskDependType;
    }

    public User getLoginUser() {
        return loginUser;
    }

    public long getWorkflowInstanceId() {
        return workflowInstanceId;
    }

    public String getStartNodeList() {
        return startNodeList;
    }

    public TaskDependType getTaskDependType() {
        return taskDependType;
    }
}