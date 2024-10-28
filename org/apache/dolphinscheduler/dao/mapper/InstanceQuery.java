package org.apache.dolphinscheduler.dao.mapper;

import java.util.Date;
import java.util.Set;

public class InstanceQuery {
    private Long projectCode;
    private Long workflowDefinitionCode;
    private Date startTime;
    private Date endTime;
    private Integer state;
    private Long workflowCode;
    private Integer model;
    private Set<Integer> projectIds;

    // Constructor, getters, and setters
}