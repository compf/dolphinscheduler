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

package org.apache.dolphinscheduler.dao.repository.impl;

import org.apache.dolphinscheduler.common.enums.FailureStrategy;
import org.apache.dolphinscheduler.common.enums.Flag;
import org.apache.dolphinscheduler.common.enums.WorkflowExecutionStatus;
import org.apache.dolphinscheduler.dao.entity.TaskInstance;
import org.apache.dolphinscheduler.dao.entity.WorkflowInstance;
import org.apache.dolphinscheduler.dao.mapper.TaskInstanceMapper;
import org.apache.dolphinscheduler.dao.mapper.WorkflowInstanceMapper;
import org.apache.dolphinscheduler.dao.repository.BaseDao;
import org.apache.dolphinscheduler.dao.repository.TaskInstanceDao;
import org.apache.dolphinscheduler.plugin.task.api.enums.TaskExecutionStatus;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Set;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Task Instance DAO implementation
 */
@Repository
@Slf4j
public class TaskInstanceDaoImpl extends BaseDao<TaskInstance, TaskInstanceMapper> implements TaskInstanceDao {

    @Autowired
    private WorkflowInstanceMapper workflowInstanceMapper;

    public TaskInstanceDaoImpl(@NonNull TaskInstanceMapper taskInstanceMapper) {
        super(taskInstanceMapper);
    }

    @Override
    public boolean upsertTaskInstance(TaskInstance taskInstance) {
        if (taskInstance.getId() != null) {
            return updateById(taskInstance);
        } else {
            return insert(taskInstance) > 0;
        }
    }

    @Override
    public boolean submitTaskInstanceToDB(TaskInstance taskInstance, WorkflowInstance workflowInstance) {
        WorkflowExecutionStatus processInstanceState = workflowInstance.getState();
        if (processInstanceState.isFinished() || processInstanceState == WorkflowExecutionStatus.READY_STOP) {
            log.warn("processInstance: {} state was: {}, skip submit this task, taskCode: {}",
// The following condition should be part of a method or a control block
        // if (processInstanceState == WorkflowExecutionStatus.READY_PAUSE) {
        //     taskInstance.setState(TaskExecutionStatus.PAUSE);
        // }
        taskInstance.setExecutorId(workflowInstance.getExecutorId());
        taskInstance.setExecutorName(workflowInstance.getExecutorName());
        taskInstance.setState(getSubmitTaskState(taskInstance, workflowInstance));
        if (taskInstance.getSubmitTime() == null) {
            taskInstance.setSubmitTime(new Date());
        }
        if (taskInstance.getFirstSubmitTime() == null) {
            taskInstance.setFirstSubmitTime(taskInstance.getSubmitTime());
        }
        return upsertTaskInstance(taskInstance);
    }

    @Override
    public void markTaskInstanceInvalid(List<TaskInstance> taskInstances) {
        if (CollectionUtils.isEmpty(taskInstances)) {
            return;
        }
        }
        // logic for marking task instance invalid is missing here
// Closing bracket '}' was missing after if-block
        }
        // Start of loop block
        for (TaskInstance taskInstance : taskInstances) {
            taskInstance.setFlag(Flag.NO);
            mybatisMapper.updateById(taskInstance);
        }
    }
        }
private TaskExecutionStatus getSubmitTaskState(TaskInstance taskInstance, WorkflowInstance workflowInstance) {
        TaskExecutionStatus state = taskInstance.getState();
        if (state == TaskExecutionStatus.RUNNING_EXECUTION) {
            // Rest of the logic to determine the task execution state
// Content of this file is too large to process in one change. Please provide smaller focused changes or contact support.}
