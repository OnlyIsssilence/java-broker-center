package com.tops001.domain.company.parameters;

import com.tops001.domain.common.BaseParam;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.Min;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.io.Serializable;

/**
 * Author:zhangmingqiang on 2016/8/15.
 * Date  :2016/8/15.
 * Description:
 */
public class BrokerCompanyParameter extends BaseParam implements Serializable{

    @ApiParam(value = "城市ID")
    @DefaultValue("0")
    @QueryParam("cityId")
    private Integer cityId;

    @ApiParam(value = "公司类型 1微型 2小型 3中型 4大型")
    @DefaultValue("0")
    @QueryParam("companyType")
    private Integer companyType;

    @ApiParam(value = "经纪公司名称 模糊查询")
    @QueryParam("companyName")
    private String companyName;

    @ApiParam(value = "排序键 0按添加时间 1按门店数量 2按经纪人数量")
    @DefaultValue("0")
    @QueryParam("orderBy")
    private Integer orderBy;

    //排序规则，根据orderBy关键字转换
    private String orderByName;

    //公司规模，根据companyType转换
    private String shopScale;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
        else if(this.orderBy == 2){
            return "broker_number desc";
        }
        else {
            return "create_time desc";
        }
    }

    public String getShopScale() {
        if (this.companyType == 1){
            return "shop_number = 1";
        }
        if(this.orderBy == 2){
            return "shop_number >= 2 AND shop_number <= 5";
        }
        else if(this.orderBy == 3){
            return "shop_number >= 6 AND shop_number <= 15";
        }
        else {
            return "shop_number >=16";
        }
    }

}
