package org.apache.dolphinscheduler.api.controller;

import org.apache.dolphinscheduler.common.enums.FailureStrategy;
import org.apache.dolphinscheduler.common.enums.Priority;
import org.apache.dolphinscheduler.common.enums.WarningType;
import org.apache.dolphinscheduler.dao.entity.User;

public class ScheduleCreationInfo {

    private User loginUser;
    private long projectCode;
    private long workflowDefinitionCode;
    private String schedule;
    private WarningType warningType;
    private int warningGroupId;
    private FailureStrategy failureStrategy;
    private String workerGroup;
    private String tenantCode;
    private Priority workflowInstancePriority;
    // Constructor, getters, and any other logic
}
