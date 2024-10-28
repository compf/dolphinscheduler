package org.apache.dolphinscheduler.dao.model;

public class InstanceQuery {

    private Long projectCode;
    private Long workflowDefinitionCode;
    private String name;
    private String startTime;
    private String endTime;
    private Integer state;
    private String host;

    public InstanceQuery(Long projectCode, Long workflowDefinitionCode, String name, String startTime, String endTime, Integer state, String host) {
        this.projectCode = projectCode;
        this.workflowDefinitionCode = workflowDefinitionCode;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.state = state;
        this.host = host;
    }

    public Long getProjectCode() {
        return projectCode;
    }

    public Long getWorkflowDefinitionCode() {
        return workflowDefinitionCode;
    }

    public String getName() {
        return name;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Integer getState() {
        return state;
    }

    public String getHost() {
        return host;
    }
}