package com.mlby.pojo;

import java.util.Date;

public class Engineer {
    private Integer id;

    private Integer orderNo;

    private String engineerName;

    private String handleSituation;

    private String repairDesc;

    private String userEvaluate;

    private Date evaluateTime;

    private String userIdea;

    private Date createTime;

    private Date updateTime;

    public Engineer(Integer id, Integer orderNo, String engineerName, String handleSituation, String repairDesc, String userEvaluate, Date evaluateTime, String userIdea, Date createTime, Date updateTime) {
        this.id = id;
        this.orderNo = orderNo;
        this.engineerName = engineerName;
        this.handleSituation = handleSituation;
        this.repairDesc = repairDesc;
        this.userEvaluate = userEvaluate;
        this.evaluateTime = evaluateTime;
        this.userIdea = userIdea;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Engineer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName == null ? null : engineerName.trim();
    }

    public String getHandleSituation() {
        return handleSituation;
    }

    public void setHandleSituation(String handleSituation) {
        this.handleSituation = handleSituation == null ? null : handleSituation.trim();
    }

    public String getRepairDesc() {
        return repairDesc;
    }

    public void setRepairDesc(String repairDesc) {
        this.repairDesc = repairDesc == null ? null : repairDesc.trim();
    }

    public String getUserEvaluate() {
        return userEvaluate;
    }

    public void setUserEvaluate(String userEvaluate) {
        this.userEvaluate = userEvaluate == null ? null : userEvaluate.trim();
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public String getUserIdea() {
        return userIdea;
    }

    public void setUserIdea(String userIdea) {
        this.userIdea = userIdea == null ? null : userIdea.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}