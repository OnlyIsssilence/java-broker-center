package com.tops001.domain.company.parameters;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.io.Serializable;

/**
 * Author:zhangmingqiang on 2016/8/15.
 * Date  :2016/8/15.
 * Description:
 */
public class BrokerTopCompanyParameter implements Serializable{

    @ApiParam(value = "排序键 1按门店数量 2按经纪人数量", required = false, defaultValue = "1")
    @DefaultValue("0")
    @QueryParam("orderBy")
    private Integer orderBy;

    @JsonIgnore
    private Integer pageSize;

    private String orderByName;


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderByName() {
        if(this.orderBy == 1){
            return "shop_number desc";
        }
        else{
            return "broker_number desc";
        }
    }

}
