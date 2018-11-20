package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description 大学基本信息
 * @Date : 2018/10/10 15:53
 */
public class UniversityBasicInfo {

    /** 大学主标识 */
    private Integer universityId;

    /** 大学名称 */
    private String universityName;

    /** 大学所属国家标识符 */
    private Integer countryId;

    /** 大学所属国家名 */
    private String countryName;

    /** 大学地区主标识(二级) */
    private Integer provinceId;

    /** 大学所属省份 */
    private String provinceName;
    
    /** 大学类型主标识 985...*/
    private Integer universityTypeId;

    /** 大学类型 */
    private String universityTypeName;

    /** 大学科目类型——综合0、理工1 */
    private Integer universitySubjectType;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "UniversityBasicInfo{" +
                "universityId=" + universityId +
                ", universityName='" + universityName + '\'' +
                ", countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", provinceId=" + provinceId +
                ", provinceName='" + provinceName + '\'' +
                ", universityTypeId=" + universityTypeId +
                ", universityTypeName='" + universityTypeName + '\'' +
                ", universityObjectType=" + universitySubjectType +
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

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getUniversityTypeId() {
        return universityTypeId;
    }

    public void setUniversityTypeId(Integer universityTypeId) {
        this.universityTypeId = universityTypeId;
    }

    public String getUniversityTypeName() {
        return universityTypeName;
    }

    public void setUniversityTypeName(String universityTypeName) {
        this.universityTypeName = universityTypeName;
    }

    public Integer getUniversitySubbjectType() {
        return universitySubjectType;
    }

    public void setUniversitySubjectType(Integer universitySubjectType) {
        this.universitySubjectType = universitySubjectType;
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
