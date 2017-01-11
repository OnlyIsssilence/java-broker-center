package com.tops001.domain.broker.parameters;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.io.Serializable;

/**
 * Author:zhangmingqiang on 2016/8/13.
 * Date  :2016/8/13.
 * Description:
 */

public class BrokerTopParameter implements Serializable {

    /*@ApiParam(value = "排序键 1新房成交量 2二手房成交量 3装修宝成交量", required = false, defaultValue = "1")
    @DefaultValue("1")@PathParam("orderBy")Integer orderBy,
    @ApiParam(value = "城市ID", required = false, defaultValue = "0")
    @DefaultValue("0")@QueryParam("cityId")Integer cityId,
    @ApiParam(value = "页大小", required = false, defaultValue = "10")
    @DefaultValue("10")@QueryParam("pageSize")Integer pageSize*/

    @ApiParam(value = "城市ID")
    @DefaultValue("0")
    @QueryParam("cityId")
    private Integer cityId;

    @ApiParam(value = "排序方式  0：新房,1：二手房，2：装修宝")
    @QueryParam("orderByIndex")
    @DefaultValue("0")
    private Integer orderByIndex;

    private String orderByName;

    @ApiParam(value = "统计年份")
    @DefaultValue("0")
    @QueryParam("staticYear")
    private Integer staticYear;

    @ApiParam(value = "统计月份")
    @QueryParam("staticMonth")
    @DefaultValue("0")
    private Integer staticMonth;

    @JsonIgnore
    private Integer pageSize;


    public Integer getOrderByIndex() {
        return orderByIndex;
    }

    public void setOrderByIndex(Integer orderByIndex) {
        this.orderByIndex = orderByIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByName() {

        if (this.orderByIndex == 1) {
            return "new_house_deal_num desc";
        } else if (this.orderByIndex == 2) {
            return "seconde_house_deal_num desc";
        } else if (this.orderByIndex == 3) {
            return "decorate_deal_num desa";
        } else {
            return null;
        }
    }

    public void setOrderByName(String orderByName) {
        this.orderByName = orderByName;
    }


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getStaticYear() {
        return staticYear;
    }

    public void setStaticYear(Integer staticYear) {
        this.staticYear = staticYear;
    }

    public Integer getStaticMonth() {
        return staticMonth;
    }

    public void setStaticMonth(Integer staticMonth) {
        this.staticMonth = staticMonth;
    }
}
