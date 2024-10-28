package org.apache.dolphinscheduler.api.service;

import org.apache.dolphinscheduler.dao.entity.User;

public class ProjectParameterRequest {
    private User loginUser;
    private long projectCode;
    private Long code;
    private String projectParameterName;
    private String projectParameterValue;
    private String projectParameterDataType;

    public ProjectParameterRequest(User loginUser, long projectCode, Long code, String projectParameterName, String projectParameterValue, String projectParameterDataType) {
        this.loginUser = loginUser;
        this.projectCode = projectCode;
        this.code = code;
        this.projectParameterName = projectParameterName;
        this.projectParameterValue = projectParameterValue;
        this.projectParameterDataType = projectParameterDataType;
    }

    // getters and setters
}