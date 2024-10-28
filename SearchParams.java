public class SearchParams {
    private Long workflowDefinitionCode;
    private String startTime;
    private String endTime;
    private Integer state;

    public SearchParams(Long workflowDefinitionCode, String startTime, String endTime, Integer state) {
        this.workflowDefinitionCode = workflowDefinitionCode;
        this.startTime = startTime;
        this.endTime = endTime;
        this.state = state;
    }

    // Getters and Setters
}