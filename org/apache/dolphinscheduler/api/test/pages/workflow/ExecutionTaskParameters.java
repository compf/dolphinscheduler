package org.apache.dolphinscheduler.api.test.pages.workflow;

import org.apache.dolphinscheduler.dao.entity.User;
import org.apache.dolphinscheduler.common.enums.TaskDependType;

public class ExecutionTaskParameters {

    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private String startNodeList;
    private TaskDependType taskDependType;

    // Constructors, getters, and setters not shown for brevity
}