package org.apache.dolphinscheduler.dao.mapper;

import java.util.Date;

public class InstanceCriteria {
    private Long projectCode;
    private Long workflowDefinitionCode;
    private String name;
    private Date startTime;
    private Date endTime;
    private Integer state;
    private String host;

    public InstanceCriteria(Long projectCode, Long workflowDefinitionCode, String name, Date startTime, Date endTime, Integer state, String host) {
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

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Integer getState() {
        return state;
    }

    public String getHost() {
        return host;
    }
}