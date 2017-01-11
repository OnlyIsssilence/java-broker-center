package com.tops001.domain.general.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2016/8/22.
 */

@ApiModel(description = "公司、门店、经纪人总数")
public class TotalNumResult {
    @ApiModelProperty(value = "公司总数")
    private Long companyNum;

    @ApiModelProperty(value = "门店总数")
    private Long shopNum;

    @ApiModelProperty(value = "经纪人总数")
    private Long brokerNum;

    public Long getCompanyNum() {
        return companyNum;
    }

    public void setCompanyNum(Long companyNum) {
        this.companyNum = companyNum;
    }

    public Long getShopNum() {
        return shopNum;
    }

    public void setShopNum(Long shopNum) {
        this.shopNum = shopNum;
    }

    public Long getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(Long brokerNum) {
        this.brokerNum = brokerNum;
    }
}
