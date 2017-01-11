package com.tops001.domain.shop.parameters;

import com.tops001.domain.common.BaseParam;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.io.Serializable;

/**
 * Author:zhangmingqiang on 2016/8/13.
 * Date  :2016/8/13.
 * Description:门店列表参数集合
 */
public class BrokerShopParameter extends BaseParam implements Serializable {

    @ApiParam(value = "公司ID")
    @DefaultValue("0")
    @QueryParam("companyId")
    private Integer companyId;

    @ApiParam(value = "城市ID")
    @DefaultValue("0")
    @QueryParam("cityId")
    private Integer cityId;

    /*@ApiParam(value = "所在区域")
    @DefaultValue("")
    @QueryParam("location")*/
    private String location;

    @ApiParam(value = "模糊查询门店名称或编号")
    @DefaultValue("")
    @QueryParam("shopNameOrCode")
    private String shopNameOrCode;

    @ApiParam(value = "排序方式 1：门店序号排序 2：经纪人数量排序")
    @DefaultValue("1")
    @QueryParam("orderBy")
    private Integer orderBy;

    //排序规则，根据orderBy关键字转换
    private String orderByName;

    public String getOrderByName() {
        if(this.orderBy == 2){
            return "broker_number desc";
        }
        else {
            return "shop_code desc";
        }
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShopNameOrCode() {
        return shopNameOrCode;
    }

    public void setShopNameOrCode(String shopNameOrCode) {
        this.shopNameOrCode = shopNameOrCode;
    }
}
