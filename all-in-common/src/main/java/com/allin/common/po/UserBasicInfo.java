package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description 用户的基本信息
 * @Date : 2018/10/9 21:52
 */
public class UserBasicInfo {
    /** 用户基本信息Id */
    private Integer userId;

    /** 昵称 */
    private String nickname;
    
    /** 用户名 */
    private String name;

    /** 电话号码 */
    private String telephone;

    /** 密码 */
    private String password;
    
    /** 性别 */
    private Integer gender;

    /** 个性签名 */
    private String autograph;

    /** 头像URL */
    private String profilePhotoUrl;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "UserBasicInfo{" +
                "userId=" + userId +
                ", nickname='" + nickname + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", autograph='" + autograph + '\'' +
                ", profilePhotoUrl='" + profilePhotoUrl + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public LocalDateTime getDataCreateTime() {
        return dataCreateTime;
    }

    public void setDataCreateTime(LocalDateTime dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }

    public LocalDateTime getDataModifyTime() {
        return dataModifyTime;
    }

    public void setDataModifyTime(LocalDateTime dataModifyTime) {
        this.dataModifyTime = dataModifyTime;
    }

    public Integer getDataIsDeleted() {
        return dataIsDeleted;
    }

    public void setDataIsDeleted(Integer dataIsDeleted) {
        this.dataIsDeleted = dataIsDeleted;
    }
}
