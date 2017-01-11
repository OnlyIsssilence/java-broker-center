package com.tops001.shop.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/8/2.
 */
public class BrokerShop {
    /**
     * 门店Id
     */
    private Long shopId;

    /**
     * 公司ID
     */
    private Long companyId;

    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 门店编号
     */
    private String shopCode;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 办公电话
     */
    private String officephone;

    /**
     * 家庭电话
     */
    private String homephone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 省份Id
     */
    private Long provinceId;

    /**
     * 省份名称
     */
    private String provinceName;

    /**
     * 城市Id
     */
    private Long cityId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 经纪人数
     */
    private Integer brokerNumber;

    /**
     * 新房成交量
     */
    private Integer newHouseDealNum;

    /**
     * 二手房成交量
     */
    private Integer secondHouseDealNum;

    /**
     * 装修宝成交量
     */
    private Integer decorateDealNum;

    /**
     * 成立时间
     */
    private Timestamp formationDate;

    /**
     * 接入时间
     */
    private Timestamp createTime;

    /**
     * 修改时间
     */
    private Timestamp updateTime;

    /**
     * 公司名称
     */
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
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

    public Integer getNewHouseDealNum() {
        return newHouseDealNum;
    }

    public void setNewHouseDealNum(Integer newHouseDealNum) {
        this.newHouseDealNum = newHouseDealNum;
    }

    public Integer getSecondHouseDealNum() {
        return secondHouseDealNum;
    }

    public void setSecondHouseDealNum(Integer secondHouseDealNum) {
        this.secondHouseDealNum = secondHouseDealNum;
    }

    public Integer getDecorateDealNum() {
        return decorateDealNum;
    }

    public void setDecorateDealNum(Integer decorateDealNum) {
        this.decorateDealNum = decorateDealNum;
    }

    @Override
    public String toString() {
        return "BrokerShop{" +
                "shopId=" + shopId +
                ", companyId=" + companyId +
                ", shopName='" + shopName + '\'' +
                ", shopCode='" + shopCode + '\'' +
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
                ", brokerNumber=" + brokerNumber +
                ",newHouseDealNum=" + newHouseDealNum +
                ",secondHouseDealNum=" + secondHouseDealNum +
                ",decorateDealNum=" + decorateDealNum +
                ", formationDate=" + formationDate +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
