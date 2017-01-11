package com.tops001.domain.broker.result;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2016/7/26.
 */
public class TestResult {
    @ApiModelProperty(value = "经纪人Id")
    private long   brokerId;

    @ApiModelProperty(value = "经纪人姓名")
    private String brokerName;

    @ApiModelProperty(value = "经纪人性别")
    private int brokerGender;

    public long getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(long brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public int getBrokerGender() {
        return brokerGender;
    }

    public void setBrokerGender(int brokerGender) {
        this.brokerGender = brokerGender;
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

    @ApiModelProperty(value = "经纪人手机号")
    private String brokerPhone;

    @ApiModelProperty(value = "经纪人头像地址")
    private String brokerPicImage;
}
