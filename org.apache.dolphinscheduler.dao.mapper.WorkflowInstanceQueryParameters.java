package org.apache.dolphinscheduler.dao.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.dolphinscheduler.dao.entity.WorkflowInstance;

public class WorkflowInstanceQueryParameters {

    private Page<WorkflowInstance> page;
    private Long projectCode;
    private String name;
    private String host;
    // Constructor, getters, and any other logic
}
