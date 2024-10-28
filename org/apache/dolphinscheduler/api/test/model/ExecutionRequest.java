package org.apache.dolphinscheduler.api.test.model;

import org.apache.dolphinscheduler.api.enums.ExecuteType;
import org.apache.dolphinscheduler.dao.entity.User;

import java.util.HashMap;
import java.util.Map;

public class ExecutionRequest {

    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private ExecuteType executeType;

    // Constructor, getters and setters

    public Map<String, Object> toParamsMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("loginUser", loginUser);
        params.put("projectCode", projectCode);
        params.put("workflowInstanceId", workflowInstanceId);
        params.put("executeType", executeType.name());
        return params;
    }
}