package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description
 * @Date : 2018/10/15 21:12
 */
public class Teacher {
    /** 老师id */
    private Integer teacherId;

    /** 用户id关联 */
    private Integer userId;

    /** 用户名 */
    private String username;

    /** 状态 1 在职 0 离开 */
    private Integer status;

    /** 加入学校时间 */
    private LocalDateTime joinTime;

    /** 离开时间 */
    private  LocalDateTime leaveTime;

    /** 学院id */
    private Integer collegeId;

    /** 学院名称 */
    private String collegeName;

    /** 学校ID */
    private Integer universityId;

    /** 学校名称 */
    private String universityName;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", status=" + status +
                ", joinTime=" + joinTime +
                ", leaveTime=" + leaveTime +
                ", collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", universityId=" + universityId +
                ", universityName='" + universityName + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(LocalDateTime joinTime) {
        this.joinTime = joinTime;
    }

    public LocalDateTime getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(LocalDateTime leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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

