package org.apache.dolphinscheduler.api.test.model;

import org.apache.dolphinscheduler.common.enums.TaskDependType;
import org.apache.dolphinscheduler.dao.entity.User;

import java.util.HashMap;
import java.util.Map;

public class TaskExecutionRequest {

    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private String startNodeList;
    private TaskDependType taskDependType;

    // Constructor, getters and setters

    public Map<String, Object> toParamsMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("loginUser", loginUser);
        params.put("projectCode", projectCode);
        params.put("workflowInstanceId", workflowInstanceId);
        params.put("startNodeList", startNodeList);
        params.put("taskDependType", taskDependType.name());
        return params;
    }
}