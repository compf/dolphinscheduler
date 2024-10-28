package org.apache.dolphinscheduler.dao.mapper;

import java.util.Date;

public class WorkflowStateStatisticsFilter {
    private Date startTime;
    private Date endTime;
    private Long projectCode;
    private Long workflowCode;

    public WorkflowStateStatisticsFilter(Date startTime, Date endTime, Long projectCode, Long workflowCode) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.projectCode = projectCode;
        this.workflowCode = workflowCode;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Long getProjectCode() {
        return projectCode;
    }

    public Long getWorkflowCode() {
        return workflowCode;
    }
}
