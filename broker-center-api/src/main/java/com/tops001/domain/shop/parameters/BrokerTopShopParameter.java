package com.tops001.domain.shop.parameters;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.io.Serializable;

/**
 * Author:zhangmingqiang on 2016/8/13.
 * Date  :2016/8/13.
 * Description:
 */

public class BrokerTopShopParameter implements Serializable {

    @ApiParam(value = "城市ID")
    @DefaultValue("0")
    @QueryParam("cityId")
    private Integer cityId;

    @ApiParam(value = "排序方式  0：新房成交量，1：二手房成交量，2：装修宝成交量，3:经纪人数量")
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

        if (this.orderByIndex == 0) {
            return "new_house_deal_num desc";
        } else if (this.orderByIndex == 1) {
            return "seconde_house_deal_num desc";
        } else if (this.orderByIndex == 2) {
            return "decorate_deal_num desa";
        } else if (this.orderByIndex == 3) {
            return "broker_number desc";
        } else {
            return null;
        }
    }

    public void setOrderByName(String orderByName) {
        this.orderByName = orderByName;
    }

    /**
     * 用于排名前十的门店排序使用
     * 排序键 1按新房成交量 2按二手房成交量 3装修宝成交量 4经纪人数量
     *
     * @return
     */

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
