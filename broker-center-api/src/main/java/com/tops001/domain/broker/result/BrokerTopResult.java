package com.tops001.domain.broker.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2016/8/22.
 */
@ApiModel(description = "经纪人前十数据信息")
public class BrokerTopResult {

    @ApiModelProperty(value = "经纪人姓名")
    private String brokerName;

    @ApiModelProperty(value = "经纪人ID")
    private Long brokerId;

    @ApiModelProperty(value = "门店名称")
    private String shopName;

    @ApiModelProperty(value = "门店ID")
    private String shopId;

    @ApiModelProperty(value = "新房成交量")
    private Integer newHouseDealNum;

    @ApiModelProperty(value = "二手房成交量")
    private Integer secondHouseDealNum;

    @ApiModelProperty(value = "装修宝成交量")
    private Integer decorateDealNum;

    @ApiModelProperty(value = "所在区域")
    private String area;

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public Long getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Long brokerId) {
        this.brokerId = brokerId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
