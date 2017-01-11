package com.tops001.domain.shop.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/8/2.
 */
@ApiModel(description = "经纪门店列表")
public class BrokerTopShopResult {
    @ApiModelProperty(value = "门店Id")
    private Long shopId;

    @ApiModelProperty(value = "公司ID")
    private Long companyId;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "门店名称")
    private String shopName;

    @ApiModelProperty(value = "门店编号")
    private String shopCode;

    @ApiModelProperty(value = "联系人")
    private String contactName;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "办公电话")
    private String officephone;

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

    @ApiModelProperty(value = "经纪人数量")
    private Integer brokerNumber;

    @ApiModelProperty(value = "新房成交量")
    private Integer newHouseDealNum;

    @ApiModelProperty(value = "二手房成交量")
    private Integer secondHouseDealNum;

    @ApiModelProperty(value = "装修宝成交量")
    private Integer decorateDealNum;

    @ApiModelProperty(value = "接入时间",dataType = "java.lang.String")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getBrokerNumber() {
        return brokerNumber;
    }

    public void setBrokerNumber(Integer brokerNumber) {
        this.brokerNumber = brokerNumber;
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

}
