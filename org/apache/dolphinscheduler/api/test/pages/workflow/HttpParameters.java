package org.apache.dolphinscheduler.api.test.pages.workflow;

import org.apache.dolphinscheduler.dao.entity.User;

import java.util.HashMap;
import java.util.Map;

public class HttpParameters {
    private Map<String, Object> params;
    private Map<String, String> headers;

    public HttpParameters(User loginUser, long workflowInstanceCode, String sessionIdKey, String sessionId) {
        params = new HashMap<>();
        params.put("loginUser", loginUser);
        params.put("id", workflowInstanceCode);
        headers = new HashMap<>();
        headers.put(sessionIdKey, sessionId);
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}