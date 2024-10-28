package org.apache.dolphinscheduler.dao.mapper;

public class WorkflowInstanceQuery {

    private Long projectCode;
    private Long workflowDefinitionCode;
    private String name;
    private String startTime;
    private String endTime;
    private Integer state;
    private String host;

    // Constructor, getters, and setters
    public WorkflowInstanceQuery(Long projectCode, Long workflowDefinitionCode, String name, String startTime, String endTime, Integer state, String host) {
        this.projectCode = projectCode;
        this.workflowDefinitionCode = workflowDefinitionCode;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.state = state;
        this.host = host;
    }

    // Additional functionality can be added here as needed
}
