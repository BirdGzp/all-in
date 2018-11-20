package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description
 * @Date : 2018/10/15 21:24
 */
public class Major {
    /** 学院专业标识符 */
    private Integer majorId;

    /** 专业名 */
    private String majorName;

    /** 系表id */
    private Integer departmentId;

    /** 系名 */
    private String departmentName;

    /** 学校id */
    private Integer universityId;

    /** 学校名 */
    private String universityName;

    /** 专业创建时间 */
    private LocalDateTime majorCreateName;

    /** 学年制 */
    private Integer majorYears;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "Major{" +
                "majorId=" + majorId +
                ", majorName='" + majorName + '\'' +
                ", departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", universityId=" + universityId +
                ", universityName='" + universityName + '\'' +
                ", majorCreateName=" + majorCreateName +
                ", majorYears=" + majorYears +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public LocalDateTime getMajorCreateName() {
        return majorCreateName;
    }

    public void setMajorCreateName(LocalDateTime majorCreateName) {
        this.majorCreateName = majorCreateName;
    }

    public Integer getMajorYears() {
        return majorYears;
    }

    public void setMajorYears(Integer majorYears) {
        this.majorYears = majorYears;
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

