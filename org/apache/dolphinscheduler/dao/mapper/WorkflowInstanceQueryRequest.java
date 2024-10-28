package org.apache.dolphinscheduler.dao.mapper;

import java.util.Date;

public class WorkflowInstanceQueryRequest {
    private Long projectCode;
    private Long workflowDefinitionCode;
    private String name;
    private String host;
    private Date startTime;
    private Integer state;

    // Constructor, getters, and setters
}