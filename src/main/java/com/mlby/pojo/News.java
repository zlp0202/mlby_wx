package com.mlby.pojo;

import java.util.Date;

public class News {
    private Integer id;

    private Integer newId;

    private String newName;

    private String newNeirong;

    private String userName;

    private Date createTime;

    private Date updateTime;

    public News(Integer id, Integer newId, String newName, String newNeirong, String userName, Date createTime, Date updateTime) {
        this.id = id;
        this.newId = newId;
        this.newName = newName;
        this.newNeirong = newNeirong;
        this.userName = userName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public News() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName == null ? null : newName.trim();
    }

    public String getNewNeirong() {
        return newNeirong;
    }

    public void setNewNeirong(String newNeirong) {
        this.newNeirong = newNeirong == null ? null : newNeirong.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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