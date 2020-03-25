package com.mlby.pojo;

import java.util.Date;

public class UserAuths {
    private Integer id;

    private Integer userid;

    private String thirdKey;

    private String thirdType;

    private Date createTime;

    private Date updateTime;

    public UserAuths(Integer id, Integer userid, String thirdKey, String thirdType, Date createTime, Date updateTime) {
        this.id = id;
        this.userid = userid;
        this.thirdKey = thirdKey;
        this.thirdType = thirdType;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public UserAuths() {
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

    public String getThirdKey() {
        return thirdKey;
    }

    public void setThirdKey(String thirdKey) {
        this.thirdKey = thirdKey == null ? null : thirdKey.trim();
    }

    public String getThirdType() {
        return thirdType;
    }

    public void setThirdType(String thirdType) {
        this.thirdType = thirdType == null ? null : thirdType.trim();
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