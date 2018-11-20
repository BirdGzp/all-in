package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description
 * @Date : 2018/10/10 18:22
 */
public class UniversityAssistInfo {

    /** 大学主标识 */
    private Integer universityId;

    /** 大学经度 */
    private Double longitude;

    /** 大学纬度 */
    private Double latitude;

    /** 邮政编码 */
    private Integer postalCode;

    /** 联系电话 */
    private String universityContactNumber;

    /** 学校邮箱 */
    private String universityEmail ;
    
    /** 举办者类型 1是教育部门 2是其他部门 3是地方企业 4是民办 */
    private Integer universityHost;
    
    /** 土地产权 */
    private String landProperty;
    
    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "UniversityAssistInfo{" +
                "universityId=" + universityId +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", postalCode=" + postalCode +
                ", universityContactNumber='" + universityContactNumber + '\'' +
                ", universityEmail='" + universityEmail + '\'' +
                ", universityHost=" + universityHost +
                ", landProperty='" + landProperty + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getUniversityContactNumber() {
        return universityContactNumber;
    }

    public void setUniversityContactNumber(String universityContactNumber) {
        this.universityContactNumber = universityContactNumber;
    }

    public String getUniversityEmail() {
        return universityEmail;
    }

    public void setUniversityEmail(String universityEmail) {
        this.universityEmail = universityEmail;
    }

    public Integer getUniversityHost() {
        return universityHost;
    }

    public void setUniversityHost(Integer universityHost) {
        this.universityHost = universityHost;
    }

    public String getLandProperty() {
        return landProperty;
    }

    public void setLandProperty(String landProperty) {
        this.landProperty = landProperty;
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
