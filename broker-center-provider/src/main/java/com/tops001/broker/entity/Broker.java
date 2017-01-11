package com.tops001.broker.entity;

import com.tops001.domain.common.ResultUtils;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/2.
 */
public class Broker {
    /**
     * 经纪人Id
     */
    private Long brokerId;

    /**
     * 经纪人姓名
     */
    private String brokerName;

    /**
     * 经纪人所属公司的ID
     */
    private Long companyId;

    /**
     * 经纪人所属公司的名称
     */
    private String companyName;

    /**
     * 经纪人所属的城市ID
     */
    private Long cityId;

    /**
     * 经纪人所属城市的名称
     */
    private String cityName;

    /**
     * 门店ID
     */
    private Long shopId;

    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 经纪人性别 0未知1男 2女
     */
    private Integer gender;

    /**
     * 经纪人生日
     */
    private Date birthday;

    /**
     * 毕业院校
     */
    private String university;

    /**
     * 学历 1高中/中专以下，2高中/中专，3大专，4本科，5硕士以上
     */
    private Integer education;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 身份证号码
     */
    private String idNumber;

    /**
     * 开户行名称
     */
    private String bankName;

    /**
     * 开户行卡号
     */
    private String bankAccount;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * QQ号
     */
    private String QQ;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 居住地址
     */
    private String address;

    /**
     * 外语类型
     */
    private String languageType;

    /**
     * 外语等级
     */
    private String languageClass;

    /**
     * 住房类型 1租房2买房
     */
    private Integer housingType;

    /**
     * 交通方式 0未知 1公交车，2出租车/快车，3电瓶车，4自行车，5步行，6私家车
     */
    private Integer transportation;

    /**
     * 婚姻状况 0未知 1单身2未婚3已婚4离异
     */
    private Integer hasMarriage;

    /**
     * 是否有孩子 0未知 1无 2有
     */
    private Integer hasChildren;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 民族
     */
    private String nation;

    /**
     * 身高
     */
    private double height;

    /**
     * 体重
     */
    private double weight;

    /**
     * 兴趣爱好
     */
    private String interest;

    /**
     * 个人简介
     */
    private String introduction;

    /**
     * 个人头像
     */
    private String picUrl;

    /**
     * 状态，0未注册，1已注册，2签约，3禁用，4离职申请
     */
    private Integer brokerStatus;

    /**
     * 是否认证 0未知 1未认证 2认证
     */
    private Integer isAuth;

    /**
     * 从业日期
     */
    private Date workingTime;

    /**
     * 服务器区域
     */
    private String serverArea;

    /**
     * 当前区域从业日期
     */
    private Date areaWorkingTime;

    /**
     * 其他行业经验
     */
    private String otherExperience;

    /**
     * 其他行业工作类型
     */
    private String otherWorkingType;

    /**
     * 服务小区
     */
    private String serverVillage;

    /**
     * 基本素质评分
     */
    private double basicQuality;

    /**
     * 业务能力评分
     */
    private double businessAbility;

    /**
     * 综合能力评分
     */
    private double overallAbility;

    /**
     * 所在城市排名
     */
    private double cityRank;

    /**
     * 新增时间
     */
    private Timestamp createTime;

    /**
     * 修改时间
     */
    private Timestamp updateTime;

    /**
     * 最后激活时间
     */
    private Timestamp activeTime;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Long getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Long brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLanguageType() {
        return languageType;
    }

    public void setLanguageType(String languageType) {
        this.languageType = languageType;
    }

    public String getLanguageClass() {
        return languageClass;
    }

    public void setLanguageClass(String languageClass) {
        this.languageClass = languageClass;
    }

    public Integer getHousingType() {
        return housingType;
    }

    public void setHousingType(Integer housingType) {
        this.housingType = housingType;
    }

    public Integer getTransportation() {
        return transportation;
    }

    public void setTransportation(Integer transportation) {
        this.transportation = transportation;
    }

    public Integer getHasMarriage() {
        return hasMarriage;
    }

    public void setHasMarriage(Integer hasMarriage) {
        this.hasMarriage = hasMarriage;
    }

    public Integer getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Integer hasChildren) {
        this.hasChildren = hasChildren;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getBrokerStatus() {
        return brokerStatus;
    }

    public void setBrokerStatus(Integer brokerStatus) {
        this.brokerStatus = brokerStatus;
    }

    public Integer getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Integer isAuth) {
        this.isAuth = isAuth;
    }

    public Date getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(Date workingTime) {
        this.workingTime = workingTime;
    }

    public String getServerArea() {
        return serverArea;
    }

    public void setServerArea(String serverArea) {
        this.serverArea = serverArea;
    }

    public Date getAreaWorkingTime() {
        return areaWorkingTime;
    }

    public void setAreaWorkingTime(Date areaWorkingTime) {
        this.areaWorkingTime = areaWorkingTime;
    }

    public String getOtherExperience() {
        return otherExperience;
    }

    public void setOtherExperience(String otherExperience) {
        this.otherExperience = otherExperience;
    }

    public String getOtherWorkingType() {
        return otherWorkingType;
    }

    public void setOtherWorkingType(String otherWorkingType) {
        this.otherWorkingType = otherWorkingType;
    }

    public String getServerVillage() {
        return serverVillage;
    }

    public void setServerVillage(String serverVillage) {
        this.serverVillage = serverVillage;
    }

    public double getBasicQuality() {
        return basicQuality;
    }

    public void setBasicQuality(double basicQuality) {
        this.basicQuality = basicQuality;
    }

    public double getBusinessAbility() {
        return businessAbility;
    }

    public void setBusinessAbility(double businessAbility) {
        this.businessAbility = businessAbility;
    }

    public double getOverallAbility() {
        return overallAbility;
    }

    public void setOverallAbility(double overallAbility) {
        this.overallAbility = overallAbility;
    }

    public double getCityRank() {
        return cityRank;
    }

    public void setCityRank(double cityRank) {
        this.cityRank = cityRank;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Timestamp activeTime) {
        this.activeTime = activeTime;
    }

}
