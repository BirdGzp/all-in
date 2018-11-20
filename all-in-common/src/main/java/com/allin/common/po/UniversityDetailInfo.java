package com.allin.common.po;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Harold
 * @Description 大学详细信息表
 * @Date : 2018/10/10 17:25
 */
public class UniversityDetailInfo {

    /** 大学主标识 */
    private Integer universityId;
    
    /** 大学名称 */
    private String universityName;

    /** 学校英文名 */
    private String universityEnName;

    /** 学校简称 */
    private String universityAbbName;

    /** 校训 */
    private String universityMotto;

    /** 学校官网 */
    private String universityWebsite;

    /** 百科介绍 */
    private String universityInBaike;

    /** 学校创办时间 */
    private String universityCreateTime;

    /** 学校校长 */
    private String universityHeadmaster;
    
    /** 学校地址路径标识符 */
    private Integer universityAddressId;

    /** 路径补充 */
    private String universityAddressAppend;

    /** 校庆日 */
    private LocalDate universityCelebrationDay;

    /** 其他补充信息(json串的形式补充) */
    private String universityMessageAppend;
    
    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "UniversityDetailInfo{" +
                "universityId=" + universityId +
                ", universityName='" + universityName + '\'' +
                ", universityEnName='" + universityEnName + '\'' +
                ", universityAbbName='" + universityAbbName + '\'' +
                ", universityMotto='" + universityMotto + '\'' +
                ", universityWebsite='" + universityWebsite + '\'' +
                ", universityInBaike='" + universityInBaike + '\'' +
                ", universityCreateTime='" + universityCreateTime + '\'' +
                ", universityHeadmaster='" + universityHeadmaster + '\'' +
                ", universityAddressId=" + universityAddressId +
                ", universityAddressAppend='" + universityAddressAppend + '\'' +
                ", universityCelebrationDay=" + universityCelebrationDay +
                ", universityMessageAppend='" + universityMessageAppend + '\'' +
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

    public String getUniversityEnName() {
        return universityEnName;
    }

    public void setUniversityEnName(String universityEnName) {
        this.universityEnName = universityEnName;
    }

    public String getUniversityAbbName() {
        return universityAbbName;
    }

    public void setUniversityAbbName(String universityAbbName) {
        this.universityAbbName = universityAbbName;
    }

    public String getUniversityMotto() {
        return universityMotto;
    }

    public void setUniversityMotto(String universityMotto) {
        this.universityMotto = universityMotto;
    }

    public String getUniversityWebsite() {
        return universityWebsite;
    }

    public void setUniversityWebsite(String universityWebsite) {
        this.universityWebsite = universityWebsite;
    }

    public String getUniversityInBaike() {
        return universityInBaike;
    }

    public void setUniversityInBaike(String universityInBaike) {
        this.universityInBaike = universityInBaike;
    }

    public String getUniversityCreateTime() {
        return universityCreateTime;
    }

    public void setUniversityCreateTime(String universityCreateTime) {
        this.universityCreateTime = universityCreateTime;
    }

    public String getUniversityHeadmaster() {
        return universityHeadmaster;
    }

    public void setUniversityHeadmaster(String universityHeadmaster) {
        this.universityHeadmaster = universityHeadmaster;
    }

    public Integer getUniversityAddressId() {
        return universityAddressId;
    }

    public void setUniversityAddressId(Integer universityAddressId) {
        this.universityAddressId = universityAddressId;
    }

    public String getUniversityAddressAppend() {
        return universityAddressAppend;
    }

    public void setUniversityAddressAppend(String universityAddressAppend) {
        this.universityAddressAppend = universityAddressAppend;
    }

    public LocalDate getUniversityCelebrationDay() {
        return universityCelebrationDay;
    }

    public void setUniversityCelebrationDay(LocalDate universityCelebrationDay) {
        this.universityCelebrationDay = universityCelebrationDay;
    }

    public String getUniversityMessageAppend() {
        return universityMessageAppend;
    }

    public void setUniversityMessageAppend(String universityMessageAppend) {
        this.universityMessageAppend = universityMessageAppend;
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
