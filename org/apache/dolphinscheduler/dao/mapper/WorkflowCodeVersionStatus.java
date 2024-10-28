package org.apache.dolphinscheduler.dao.mapper;

public class WorkflowCodeVersionStatus {
    private long workflowDefinitionCode;
    private int workflowDefinitionVersion;
    private int[] states;

    public WorkflowCodeVersionStatus(long workflowDefinitionCode, int workflowDefinitionVersion, int[] states) {
        this.workflowDefinitionCode = workflowDefinitionCode;
        this.workflowDefinitionVersion = workflowDefinitionVersion;
        this.states = states;
    }

    public long getWorkflowDefinitionCode() {
        return workflowDefinitionCode;
    }

    public int getWorkflowDefinitionVersion() {
        return workflowDefinitionVersion;
    }

    public int[] getStates() {
        return states;
    }
}
