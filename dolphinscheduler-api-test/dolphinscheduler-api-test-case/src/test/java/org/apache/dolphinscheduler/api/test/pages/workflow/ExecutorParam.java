public class ExecutorParam {

    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private ExecuteType executeType;

    // Constructors, getters, and setters

    public Map<String, Object> toParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("loginUser", loginUser);
        params.put("projectCode", projectCode);
        params.put("workflowInstanceId", workflowInstanceId);
        params.put("executeType", executeType);
        return params;
    }
}