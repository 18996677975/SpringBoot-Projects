package com.bigdatayu.springboot.springboot7.entity;

public class executionJobs {
    private Integer execId;

    private Integer projectId;

    private Integer version;

    private String flowId;

    private String jobId;

    private Integer attempt;

    private Long startTime;

    private Long endTime;

    private Byte status;

    private Integer executorId;

    private Long scheduleExecTime;

    private Byte invalid;

    private byte[] inputParams;

    public Integer getExecId() {
        return execId;
    }

    public void setExecId(Integer execId) {
        this.execId = execId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getExecutorId() {
        return executorId;
    }

    public void setExecutorId(Integer executorId) {
        this.executorId = executorId;
    }

    public Long getScheduleExecTime() {
        return scheduleExecTime;
    }

    public void setScheduleExecTime(Long scheduleExecTime) {
        this.scheduleExecTime = scheduleExecTime;
    }

    public Byte getInvalid() {
        return invalid;
    }

    public void setInvalid(Byte invalid) {
        this.invalid = invalid;
    }

    public byte[] getInputParams() {
        return inputParams;
    }

    public void setInputParams(byte[] inputParams) {
        this.inputParams = inputParams;
    }
}