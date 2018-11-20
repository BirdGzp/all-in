package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description 大学排名表
 * @Date : 2018/10/10 21:01
 */
public class UniversityRank {
    
    /** 大学排名表主标识 */
    private Integer universityRankId;
    
    /** 大学主标识 */
    private Integer universityId;
    
    /** 大学名称 */
    private String universityName;

    /** 大学排名 */
    private Integer order;
    
    /** 年 */
    private Integer year;
    
    /** 排名来源 */
    private String rankFromName;

    /** 排名来源URL */
    private String rankFromUrl;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "UniversityRank{" +
                "universityRankId=" + universityRankId +
                ", universityId=" + universityId +
                ", universityName='" + universityName + '\'' +
                ", order=" + order +
                ", rankFromName='" + rankFromName + '\'' +
                ", rankFromUrl='" + rankFromUrl + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getUniversityRankId() {
        return universityRankId;
    }

    public void setUniversityRankId(Integer universityRankId) {
        this.universityRankId = universityRankId;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getRankFromName() {
        return rankFromName;
    }

    public void setRankFromName(String rankFromName) {
        this.rankFromName = rankFromName;
    }

    public String getRankFromUrl() {
        return rankFromUrl;
    }

    public void setRankFromUrl(String rankFromUrl) {
        this.rankFromUrl = rankFromUrl;
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
