package org.apache.dolphinscheduler.api.controller;

import org.apache.dolphinscheduler.common.enums.FailureStrategy;
import org.apache.dolphinscheduler.common.enums.Priority;
import org.apache.dolphinscheduler.common.enums.WarningType;
import org.apache.dolphinscheduler.dao.entity.User;

public class ScheduleUpdateParameters {
    User loginUser;
    long projectCode;
    long workflowDefinitionCode;
    String schedule;
    WarningType warningType;
    int warningGroupId;
    FailureStrategy failureStrategy;
    Priority workflowInstancePriority;
    String workerGroup;
    String tenantCode;
    long environmentCode;

    // Constructors, getters, and setters not shown for brevity
}