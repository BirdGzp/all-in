package com.allin.common.po;

import java.time.LocalDateTime;

/**
 * @author : Harold
 * @Description 用户详细信息
 * @Date : 2018/10/10 11:47
 */
public class UserDetailInfo {
    /** 用户主键号 外键关联 */
    private Integer userId;
    
    /** 邮箱 */
    private String email;

    /** 身份证 */
    private String idCard;

    /** 出生日期 */
    private LocalDateTime birhday;

    /** qq */
    private Integer qq;

    /** 微信号 */
    private String wechat;

    /** 当前状态 1 学生 2 工作 3 其他 */
    private Integer nowStatus;
    
    /** 工作地址在地域表中的id */
    private Integer workAddressId;

    /** 工作地址 */
    private String workAddress;

    /** 学校id  */
    private Integer universityId;

    /** 学校名称 */
    private String universityName;

    /** 籍贯id */
    private Integer nativePlaceId;

    /** 籍贯 */
    private String nativePlace;

    /** 星座 */
    private String  constellation;

    /** 数据创建时间 */
    private LocalDateTime dataCreateTime;

    /** 数据修改时间 */
    private LocalDateTime dataModifyTime;

    /** 是否被删除 1表示删除 0表示未删除 */
    private Integer dataIsDeleted;

    @Override
    public String toString() {
        return "UserDetailInfo{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", birhday=" + birhday +
                ", qq=" + qq +
                ", wechat='" + wechat + '\'' +
                ", nowStatus=" + nowStatus +
                ", workAddressId=" + workAddressId +
                ", workAddress='" + workAddress + '\'' +
                ", universityId=" + universityId +
                ", universityName='" + universityName + '\'' +
                ", nativePlaceId=" + nativePlaceId +
                ", nativePlace='" + nativePlace + '\'' +
                ", constellation='" + constellation + '\'' +
                ", dataCreateTime=" + dataCreateTime +
                ", dataModifyTime=" + dataModifyTime +
                ", dataIsDeleted=" + dataIsDeleted +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public LocalDateTime getBirhday() {
        return birhday;
    }

    public void setBirhday(LocalDateTime birhday) {
        this.birhday = birhday;
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Integer getNowStatus() {
        return nowStatus;
    }

    public void setNowStatus(Integer nowStatus) {
        this.nowStatus = nowStatus;
    }

    public Integer getWorkAddressId() {
        return workAddressId;
    }

    public void setWorkAddressId(Integer workAddressId) {
        this.workAddressId = workAddressId;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
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

    public Integer getNativePlaceId() {
        return nativePlaceId;
    }

    public void setNativePlaceId(Integer nativePlaceId) {
        this.nativePlaceId = nativePlaceId;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
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
