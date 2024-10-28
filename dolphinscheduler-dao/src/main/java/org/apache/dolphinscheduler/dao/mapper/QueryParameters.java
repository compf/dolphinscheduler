package org.apache.dolphinscheduler.dao.mapper;

public class QueryParameters {

    private Long workflowDefinitionCode;
    private String name;
    private String host;
    private String startTime;

    public QueryParameters(Long workflowDefinitionCode, String name, String host, String startTime) {
        this.workflowDefinitionCode = workflowDefinitionCode;
        this.name = name;
        this.host = host;
        this.startTime = startTime;
    }

    public Long getWorkflowDefinitionCode() {
        return workflowDefinitionCode;
    }

    public String getName() {
        return name;
    }

    public String getHost() {
        return host;
    }

    public String getStartTime() {
        return startTime;
    }

    // Additional functionality can be added here
}