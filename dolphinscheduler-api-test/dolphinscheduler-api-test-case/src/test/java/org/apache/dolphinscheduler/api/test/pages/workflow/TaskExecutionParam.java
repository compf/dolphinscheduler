public class TaskExecutionParam {

    private User loginUser;
    private long projectCode;
    private int workflowInstanceId;
    private String startNodeList;
    private TaskDependType taskDependType;

    // Constructors, getters, and setters

    public Map<String, Object> toParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("loginUser", loginUser);
        params.put("workflowInstanceId", workflowInstanceId);
        params.put("startNodeList", startNodeList);
        // ... Add other properties to the map
        return params;
    }
}