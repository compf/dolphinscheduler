package org.apache.dolphinscheduler.api.test.pages.workflow;

import org.apache.dolphinscheduler.api.test.entity.HttpResponse;
import org.apache.dolphinscheduler.api.test.utils.RequestClient;

public class ExecutionParameters {
    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private ExecuteType executeType;
    private String startNodeList;
    private TaskDependType taskDependType;

    public ExecutionParameters(User loginUser, long projectCode, int workflowInstanceId, ExecuteType executeType, String startNodeList, TaskDependType taskDependType) {
        this.loginUser = loginUser;
        this.projectCode = projectCode;
        this.workflowInstanceId = workflowInstanceId;
        this.executeType = executeType;
        this.startNodeList = startNodeList;
        this.taskDependType = taskDependType;
    }

    // getters and setters
}