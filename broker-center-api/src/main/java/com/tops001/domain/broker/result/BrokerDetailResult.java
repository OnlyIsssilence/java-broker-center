package com.tops001.domain.broker.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tops001.domain.common.ResultUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/2.
 */
@ApiModel(description = "经纪人详情")
public class BrokerDetailResult {
    @ApiModelProperty(value = "经纪人Id")
    private Long brokerId;

    @ApiModelProperty(value = "经纪人姓名")
    private String brokerName;

    @ApiModelProperty(value = "门店ID")
    private Long shopId;

    @ApiModelProperty(value = "门店名称")
    private String shopName;

    @ApiModelProperty(value = "所属公司ID")
    private Long companyId;

    @ApiModelProperty(value = "所属公司名称")
    private String companyName;

    @ApiModelProperty(value = "城市ID")
    private Long cityId;

    @ApiModelProperty(value = "所在城市")
    private String cityName;

    @ApiModelProperty(value = "经纪人性别 0未知1男 2女")
    private Integer gender;

    @ApiModelProperty(value = "经纪人生日")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;

    @ApiModelProperty(value = "经纪人年龄")
    private Integer age;

    @ApiModelProperty(value = "毕业院校")
    private String university;

    @ApiModelProperty(value = "学历 1高中/中专以下，2高中/中专，3大专，4本科，5硕士以上")
    private Integer education;

    @ApiModelProperty(value = "籍贯")
    private String nativePlace;

    @ApiModelProperty(value = "身份证号码")
    private String idNumber;

    @ApiModelProperty(value = "开户行名称")
    private String bankName;

    @ApiModelProperty(value = "开户行卡号")
    private String bankAccount;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "QQ号")
    private String QQ;

    @ApiModelProperty(value = "微信号")
    private String wechat;

    @ApiModelProperty(value = "居住地址")
    private String address;

    @ApiModelProperty(value = "外语类型")
    private String languageType;

    @ApiModelProperty(value = "外语等级")
    private String languageClass;

    @ApiModelProperty(value = "住房类型 1租房2买房")
    private Integer housingType;

    @ApiModelProperty(value = "交通方式 0未知 1公交车，2出租车/快车，3电瓶车，4自行车，5步行，6私家车")
    private Integer transportation;

    @ApiModelProperty(value = "婚姻状况 0未知 1单身2未婚3已婚4离异")
    private Integer hasMarriage;

    @ApiModelProperty(value = "是否有孩子 0未知 1无 2有")
    private Integer hasChildren;

    @ApiModelProperty(value = "国籍")
    private String nationality;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "身高")
    private double height;

    @ApiModelProperty(value = "体重")
    private double weight;

    @ApiModelProperty(value = "兴趣爱好")
    private String interest;

    @ApiModelProperty(value = "个人简介")
    private String introduction;

    @ApiModelProperty(value = "个人头像")
    private String picUrl;

    @ApiModelProperty(value = "状态，0未注册，1已注册，2签约，3禁用，4离职申请")
    private Integer brokerStatus;

    @ApiModelProperty(value = "是否认证 0未知 1未认证 2认证")
    private Integer isAuth;

    @ApiModelProperty(value = "从业日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date workingTime;
    @ApiModelProperty(value = "工作年限")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Integer workingYears;


    @ApiModelProperty(value = "服务器区域")
    private String serverArea;

    @ApiModelProperty(value = "当前区域从业日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date areaWorkingTime;

    @ApiModelProperty(value = "当前区域工作年限")
    private Integer areaWorkingYears;

    @ApiModelProperty(value = "其他行业经验")
    private String otherExperience;

    @ApiModelProperty(value = "其他行业工作类型")
    private String otherWorkingType;

    @ApiModelProperty(value = "服务小区")
    private String serverVillage;

    @ApiModelProperty(value = "基本素质评分")
    private double basicQuality;

    @ApiModelProperty(value = "业务能力评分")
    private double businessAbility;

    @ApiModelProperty(value = "综合能力评分")
    private double overallAbility;

    @ApiModelProperty(value = "所在城市排名")
    private double cityRank;

    @ApiModelProperty(value = "新增时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

    @ApiModelProperty(value = "修改时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

    @ApiModelProperty(value = "最后激活时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp activeTime;


    public Integer getAreaWorkingYears() {
        return ResultUtils.calBetweenDateLength(areaWorkingTime);
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getWorkingYears() {
        return ResultUtils.calBetweenDateLength(workingTime);
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

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
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

    public Integer getAge() {
        return ResultUtils.calBetweenDateLength(birthday);
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
