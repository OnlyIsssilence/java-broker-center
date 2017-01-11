package com.tops001.city.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Author:zhangmingqiang on 2016/8/17.
 * Date  :2016/8/17.
 * Description:
 */
public class City {

    @ApiModelProperty(value = "城市Id")
    private Integer cityId;

    @ApiModelProperty(value = "城市名称")
    private String cityName;


    @ApiModelProperty(value = "省份ID")
    private Integer parentId;

    @ApiModelProperty(value = "城市开通的状态 0:未开通，1:已开通")
    private Integer cityStatus;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCityStatus() {
        return cityStatus;
    }

    public void setCityStatus(Integer cityStatus) {
        this.cityStatus = cityStatus;
    }
}
