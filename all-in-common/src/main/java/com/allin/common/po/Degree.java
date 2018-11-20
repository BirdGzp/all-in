package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description 学位表，如哲学、工学等。
 * @Date : 2018/10/9 17:11
 */
public class Degree {
    /** 学位标识 */
    private Integer degreeId;

    /** 学位名称 */
    private String degreeName;

    /** 学位类型id (关联degreeTypeId) */
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
        return "Degree{" +
                "degreeId=" + degreeId +
                ", degreeName='" + degreeName + '\'' +
                ", degreeTypeId=" + degreeTypeId +
                ", degreeTypeName='" + degreeTypeName + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
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
