/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.dao.entity;

import org.apache.dolphinscheduler.common.enums.Flag;
import org.apache.dolphinscheduler.common.enums.Priority;
import org.apache.dolphinscheduler.common.enums.TaskExecuteType;
import org.apache.dolphinscheduler.plugin.task.api.enums.TaskExecutionStatus;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName("t_ds_task_instance")
public class TaskInstance implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String taskType;

    private int workflowInstanceId;

    private String workflowInstanceName;

    private Long projectCode;

    private long taskCode;
    
    private int taskDefinitionVersion;
    
    @TableField(exist = false)
    private String processDefinitionName;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(exist = false)
    private int taskGroupPriority;

    @TableField(value = "state")
    private TaskExecutionStatus state;
    @TableField(value = "project_code")
    private Long projectCode;
    @TableField(value = "first_submit_time")
    private Date firstSubmitTime;
    @TableField(value = "submit_time")
    private Date submitTime;

    @TableField(value = "start_time")
    private Date startTime;
    @TableField(value = "end_time")
    private Date endTime;
    @TableField(value = "host")
    private String host;

    @TableField(value = "execute_path")
    private String executePath;
    @TableField(value = "log_path")
    private String logPath;
    @TableField(value = "retry_times")
    private int retryTimes;

    private Flag alertFlag;

    @TableField(exist = false)
    private WorkflowInstance workflowInstance;

    @TableField(exist = false)
    private WorkflowDefinition workflowDefinition;

    @TableField(exist = false)
    private TaskDefinition taskDefine;

    private int pid;

    private String appLink;

    private Flag flag;

    private Flag isCache;

    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private String cacheKey;

    @TableField(exist = false)
    private String duration;

    private int maxRetryTimes;

    private int retryInterval;

    private Priority taskInstancePriority;

    @TableField(exist = false)
    private Priority workflowInstancePriority;

    private String workerGroup;

    private Long environmentCode;

    private String environmentConfig;

    private int executorId;

    private String varPool;

    private String executorName;

    private int delayTime;

    private String taskParams;

    private int dryRun;

    private int taskGroupId;

    private Integer cpuQuota;

    private Integer memoryMax;

    private TaskExecuteType taskExecuteType;

    private int testFlag;

    public void init(String host, Date startTime, String executePath) {
        this.host = host;
        this.startTime = startTime;
        this.executePath = executePath;
    }

}
