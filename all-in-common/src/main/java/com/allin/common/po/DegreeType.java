package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description 学位类型对象 如学士、硕士
 * @Date : 2018/10/9 17:16
 */
public class DegreeType {
    /** 学位类型标识符 */
    private Integer degreeTypeId;
    /** 学位类型名称 */
    private String degreeTypeName;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "DegreeType{" +
                "degreeTypeId=" + degreeTypeId +
                ", degreeTypeName='" + degreeTypeName + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getDegreeTypeId() {
        return degreeTypeId;
    }

    public void setDegreeTypeId(Integer degreeTypeId) {
        this.degreeTypeId = degreeTypeId;
    }

    public String getDegreeTypeName() {
        return degreeTypeName;
    }

    public void setDegreeTypeName(String degreeTypeName) {
        this.degreeTypeName = degreeTypeName;
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

