package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description
 * @Date : 2018/10/15 21:24
 */
public class Department {
    /** 系id */
    private Integer departmentId;

    /** 系名 */
    private String deparmentName;

    /** 院id */
    private Integer collegeId;

    /** 院名 */
    private String collegeName;

    /** 学校id */
    private Integer universityId;

    /** 学校名 */
    private String universityName;

    /** 系创建时间 */
    private LocalDateTime departmentCreateTime;

    /** 科目关联id */
    private Integer subjectId;

    /** 科目名 */
    private String subjectName;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", deparmentName='" + deparmentName + '\'' +
                ", collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", universityId=" + universityId +
                ", universityName='" + universityName + '\'' +
                ", departmentCreateTime=" + departmentCreateTime +
                ", subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
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

    public LocalDateTime getDepartmentCreateTime() {
        return departmentCreateTime;
    }

    public void setDepartmentCreateTime(LocalDateTime departmentCreateTime) {
        this.departmentCreateTime = departmentCreateTime;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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
