package com.mlby.pojo;

import java.util.Date;

public class Repair {
    private Integer id;

    private Integer userid;

    private Integer orderNo;

    private String repairName;

    private Date repairTime;

    private String repairPhone;

    private String repairAddress;

    private String repairDesc;

    private String repairAudio;

    private String repairImage;

    private String handlesituation;

    private Date createTime;

    private Date updateTime;

    public Repair(Integer id, Integer userid, Integer orderNo, String repairName, Date repairTime, String repairPhone, String repairAddress, String repairDesc, String repairAudio, String repairImage, String handlesituation, Date createTime, Date updateTime) {
        this.id = id;
        this.userid = userid;
        this.orderNo = orderNo;
        this.repairName = repairName;
        this.repairTime = repairTime;
        this.repairPhone = repairPhone;
        this.repairAddress = repairAddress;
        this.repairDesc = repairDesc;
        this.repairAudio = repairAudio;
        this.repairImage = repairImage;
        this.handlesituation = handlesituation;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Repair() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName == null ? null : repairName.trim();
    }

    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    public String getRepairPhone() {
        return repairPhone;
    }

    public void setRepairPhone(String repairPhone) {
        this.repairPhone = repairPhone == null ? null : repairPhone.trim();
    }

    public String getRepairAddress() {
        return repairAddress;
    }

    public void setRepairAddress(String repairAddress) {
        this.repairAddress = repairAddress == null ? null : repairAddress.trim();
    }

    public String getRepairDesc() {
        return repairDesc;
    }

    public void setRepairDesc(String repairDesc) {
        this.repairDesc = repairDesc == null ? null : repairDesc.trim();
    }

    public String getRepairAudio() {
        return repairAudio;
    }

    public void setRepairAudio(String repairAudio) {
        this.repairAudio = repairAudio == null ? null : repairAudio.trim();
    }

    public String getRepairImage() {
        return repairImage;
    }

    public void setRepairImage(String repairImage) {
        this.repairImage = repairImage == null ? null : repairImage.trim();
    }

    public String getHandlesituation() {
        return handlesituation;
    }

    public void setHandlesituation(String handlesituation) {
        this.handlesituation = handlesituation == null ? null : handlesituation.trim();
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