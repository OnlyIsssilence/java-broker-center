package com.tops001.broker.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2016/7/26.
 */
public class Test {

    private int brokerId;

    @ApiModelProperty(value = "城市ID")
    private int cityId;

    @ApiModelProperty(value = "姓名")
    private String brokerName;

    @ApiModelProperty(value = "电话")
    private String brokerPhone;

    @ApiModelProperty(value = "头像图片URL")
    private String brokerPicImage;


    public int getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(int brokerId) {
        this.brokerId = brokerId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerPhone() {
        return brokerPhone;
    }

    public void setBrokerPhone(String brokerPhone) {
        this.brokerPhone = brokerPhone;
    }

    public String getBrokerPicImage() {
        return brokerPicImage;
    }

    public void setBrokerPicImage(String brokerPicImage) {
        this.brokerPicImage = brokerPicImage;
    }
}
