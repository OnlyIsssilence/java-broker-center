package com.tops001.domain.shop.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.ws.rs.DefaultValue;
import java.sql.Timestamp;

/**
 * Author:zhangmingqiang on 2016/8/15.
 * Date  :2016/8/15.
 * Description:
 */
public class BrokerShopResult {
    @ApiModelProperty(value = "门店Id")
    private Long shopId;

    @ApiModelProperty(value = "门店名称")
    private String shopName;

    @ApiModelProperty(value = "门店编号")
    private String shopCode;

    @ApiModelProperty(value = "经纪人数量")
    private Integer brokerNumber;

    @ApiModelProperty(value = "所在区域")
    @DefaultValue("杭州市西湖区")
    private String locateArea;

    @ApiModelProperty(value = "接入时间",dataType = "java.lang.String")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

    public String getLocateArea() {
        return locateArea;
    }

    public void setLocateArea(String locateArea) {
        this.locateArea = locateArea;
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

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Integer getBrokerNumber() {
        return brokerNumber;
    }

    public void setBrokerNumber(Integer brokerNumber) {
        this.brokerNumber = brokerNumber;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
