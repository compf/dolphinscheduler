package org.apache.dolphinscheduler.api.dto;

import org.apache.dolphinscheduler.dao.entity.User;

public class ProjectParameterRequest {
    private User loginUser;
    private long projectCode;
    private long parameterCode;
    private String projectParameterName;
    private String projectParameterValue;
    private String projectParameterDataType;

    public ProjectParameterRequest(User loginUser, long projectCode, long parameterCode, String projectParameterName,
                                   String projectParameterValue, String projectParameterDataType) {
        this.loginUser = loginUser;
        this.projectCode = projectCode;
        this.parameterCode = parameterCode;
        this.projectParameterName = projectParameterName;
        this.projectParameterValue = projectParameterValue;
        this.projectParameterDataType = projectParameterDataType;
    }

    public User getLoginUser() {
        return loginUser;
    }

    public long getProjectCode() {
        return projectCode;
    }

    public long getParameterCode() {
        return parameterCode;
    }

    public String getProjectParameterName() {
        return projectParameterName;
    }

    public String getProjectParameterValue() {
        return projectParameterValue;
    }

    public String getProjectParameterDataType() {
        return projectParameterDataType;
    }
}