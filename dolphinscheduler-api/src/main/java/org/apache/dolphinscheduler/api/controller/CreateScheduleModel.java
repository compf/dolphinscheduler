package org.apache.dolphinscheduler.api.controller;

import org.apache.dolphinscheduler.common.enums.FailureStrategy;
import org.apache.dolphinscheduler.common.enums.Priority;
import org.apache.dolphinscheduler.common.enums.WarningType;
import lombok.Data;

@Data
public class CreateScheduleModel {
    private long workflowDefinitionCode;
    private String schedule;
    private WarningType warningType;
    private int warningGroupId;
    private FailureStrategy failureStrategy;
    private String workerGroup;
    private String tenantCode;
    private Long environmentCode;
    private Priority workflowInstancePriority;
}