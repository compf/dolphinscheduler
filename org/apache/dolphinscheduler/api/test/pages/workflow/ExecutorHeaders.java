package org.apache.dolphinscheduler.api.test.pages.workflow;

import org.apache.dolphinscheduler.api.test.core.Constants;

import java.util.HashMap;
import java.util.Map;

public class ExecutorHeaders {
    private String sessionId;

    public ExecutorHeaders(String sessionId) {
        this.sessionId = sessionId;
    }

    public Map<String, String> getHeadersMap() {
        Map<String, String> headers = new HashMap<>();
        headers.put(Constants.SESSION_ID_KEY, sessionId);
        return headers;
    }
}
