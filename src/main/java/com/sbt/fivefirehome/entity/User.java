package com.sbt.fivefirehome.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author <a href="mailto:Will@gtmap.cn">Will</a>
 * @version 1.0, 2018/9/11
 * @description 五火球大家庭用户表
 */
@Entity
@Table(name="user")
public class User {
    /*
     *用户ID
     */
    @Id
    @GeneratedValue
    private Integer userId;
    /*
     *名字
     */
    private String name;
    /*
     *称号
     */
    private String title;
    /*
     *性别
     */
    private String sex;
    /*
     *人物简介
     */
    private String profiles;
    /*
     *头像
     */
    private String headshots;

    public User(){

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfiles() {
        return profiles;
    }

    public void setProfiles(String profiles) {
        this.profiles = profiles;
    }

    public String getHeadshots() {
        return headshots;
    }

    public void setHeadshots(String headshots) {
        this.headshots = headshots;
    }
}
