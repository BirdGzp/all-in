package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description 专业的学科表
 *              有一级学科和二级学科之分
 * @Date : 2018/10/9 17:29
 */
public class Subject {
    /** 学科标识符 */
    private Integer subjectId;
    
    /** 学科名称 */
     private String subjectName;

     /** 学科编码 */
     private Integer subjectCode;

     /** 父级学科编码 */
     private Integer parentSubjectId;

     /** 父级学科名称 */
      private String parentSubjectName;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", subjectCode=" + subjectCode +
                ", parentSubjectId=" + parentSubjectId +
                ", parentSubjectName='" + parentSubjectName + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
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

    public Integer getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(Integer subjectCode) {
        this.subjectCode = subjectCode;
    }

    public Integer getParentSubjectId() {
        return parentSubjectId;
    }

    public void setParentSubjectId(Integer parentSubjectId) {
        this.parentSubjectId = parentSubjectId;
    }

    public String getParentSubjectName() {
        return parentSubjectName;
    }

    public void setParentSubjectName(String parentSubjectName) {
        this.parentSubjectName = parentSubjectName;
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
