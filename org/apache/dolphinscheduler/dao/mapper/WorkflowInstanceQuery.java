package org.apache.dolphinscheduler.dao.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class WorkflowInstanceQuery {

    private Page<WorkflowInstance> page;
    private Long projectCode;
    private Long workflowDefinitionCode;
    private String name;
    private String startTime;
    private String endTime;
    private Integer state;
    private String host;

    // Constructor, getters and setters

    // This class can include additional query logic if necessary
}