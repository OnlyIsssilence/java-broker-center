package com.tops001.domain.city.parameters;

import com.tops001.domain.common.BaseParam;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.io.Serializable;

/**
 * Author:zhangmingqiang on 2016/8/17.
 * Date  :2016/8/17.
 * Description:
 */
public class CityParameter implements Serializable {

    @ApiParam(value = "城市ID")
    @DefaultValue("0")
    @QueryParam("cityId")
    private Integer cityId;

    @ApiParam(value = "经纪人状态类型 0未开通，1已开通")
    @DefaultValue("0")
    @QueryParam("cityStatus")
    private Integer cityStatus;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCityStatus() {
        return cityStatus;
    }

    public void setCityStatus(Integer cityStatus) {
        this.cityStatus = cityStatus;
    }
}

