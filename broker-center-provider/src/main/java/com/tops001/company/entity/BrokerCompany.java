package com.tops001.company.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/8/1.
 */
public class BrokerCompany {
    @Override
    public String toString() {
        return "BrokerCompany{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", contactName='" + contactName + '\'' +
                ", phone='" + phone + '\'' +
                ", officephone='" + officephone + '\'' +
                ", homephone='" + homephone + '\'' +
                ", email='" + email + '\'' +
                ", provinceId=" + provinceId +
                ", provinceName='" + provinceName + '\'' +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", address='" + address + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", shopNumber=" + shopNumber +
                ", brokerNumber=" + brokerNumber +
                ", formationDate=" + formationDate +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    @ApiModelProperty(value = "公司ID")
    private Long companyId;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "公司编号")
    private String companyCode;

    @ApiModelProperty(value = "联系人")
    private String contactName;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "办公电话")
    private String officephone;

    @ApiModelProperty(value = "家庭电话")
    private String homephone;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "省份Id")
    private Long provinceId;

    @ApiModelProperty(value = "省份名称")
    private String provinceName;

    @ApiModelProperty(value = "城市Id")
    private Long cityId;

    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "经度")
    private BigDecimal longitude;

    @ApiModelProperty(value = "纬度")
    private BigDecimal latitude;

    @ApiModelProperty(value = "成立时间")
    private Timestamp formationDate;

    @ApiModelProperty(value = "门店数量")
    private Integer shopNumber;

    @ApiModelProperty(value = "经纪人数量")
    private Integer brokerNumber;

    @ApiModelProperty(value = "接入时间")
    private Timestamp createTime;

    @ApiModelProperty(value = "修改时间")
    private Timestamp updateTime;

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

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Integer getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(Integer shopNumber) {
        this.shopNumber = shopNumber;
    }

    public Integer getBrokerNumber() {
        return brokerNumber;
    }
    public void setBrokerNumber(Integer brokerNumber) {
        this.brokerNumber = brokerNumber;
    }

    public Timestamp getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(Timestamp formationDate) {
        this.formationDate = formationDate;
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
}
