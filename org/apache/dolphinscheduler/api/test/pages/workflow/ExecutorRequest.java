package org.apache.dolphinscheduler.api.test.pages.workflow;

import org.apache.dolphinscheduler.dao.entity.User;

import java.util.HashMap;
import java.util.Map;

public class ExecutorRequest {
    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private ExecuteType executeType;

    public ExecutorRequest(User loginUser, long projectCode) {
        this.loginUser = loginUser;
        this.projectCode = projectCode;
    }

    public Map<String, Object> getParamsMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("loginUser", loginUser);
        params.put("projectCode", projectCode);
        return params;
    }

    public long getProjectCode() {
        return projectCode;
    }
}
