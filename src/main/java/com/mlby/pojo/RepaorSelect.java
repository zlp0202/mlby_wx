package com.mlby.pojo;

import java.util.Date;

public class RepaorSelect {
    private Integer id;

    private Integer userid;

    private Integer orderNo;

    private Date createTime;

    private Date updateTime;

    public RepaorSelect(Integer id, Integer userid, Integer orderNo, Date createTime, Date updateTime) {
        this.id = id;
        this.userid = userid;
        this.orderNo = orderNo;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public RepaorSelect() {
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