package com.mlby.pojo;

import java.util.Date;

public class Feedback {
    private Integer id;

    private String content;

    private String phone;

    private String email;

    private Date createTime;

    private Date updateTime;

    public Feedback(Integer id, String content, String phone, String email, Date createTime, Date updateTime) {
        this.id = id;
        this.content = content;
        this.phone = phone;
        this.email = email;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Feedback() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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