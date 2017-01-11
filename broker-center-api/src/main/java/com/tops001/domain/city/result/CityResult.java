package com.tops001.domain.city.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Author:zhangmingqiang on 2016/8/17.
 * Date  :2016/8/17.
 * Description:
 */

@ApiModel(description = "城市列表数据")
public class CityResult {

    @ApiModelProperty(value = "城市Id")
    private Integer cityId;

    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @ApiModelProperty(value = "城市状态")
    private Integer cityStatus;

    public Integer getCityStatus() {
        return cityStatus;
    }

    public void setCityStatus(Integer cityStatus) {
        this.cityStatus = cityStatus;
    }

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
}
