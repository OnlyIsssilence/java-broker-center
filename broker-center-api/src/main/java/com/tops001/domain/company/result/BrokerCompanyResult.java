package com.tops001.domain.company.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/1.
 */
@ApiModel(description = "经纪公司列表")
public class BrokerCompanyResult {
    @ApiModelProperty(value = "公司ID")
    private Long companyId;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "公司编号")
    private String companyCode;

    @ApiModelProperty(value = "城市Id")
    private Long cityId;

    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @ApiModelProperty(value = "门店数量")
    private Integer shopNumber;

    @ApiModelProperty(value = "经纪人数量")
    private Integer brokerNumber;

    @ApiModelProperty(value = "接入时间",dataType = "java.lang.String")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BrokerCompanyResult{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", shopNumber=" + shopNumber +
                ", brokerNumber=" + brokerNumber +
                ", createTime=" + createTime +
                '}';
    }
}
