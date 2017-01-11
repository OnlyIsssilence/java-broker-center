package com.tops001.domain.broker.parameters;

import com.tops001.domain.common.BaseParam;
import com.tops001.domain.common.ResultUtils;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:zhangmingqiang on 2016/8/10.
 * Date  :2016/8/10.
 * Description:
 */
public class BrokerParameter extends BaseParam implements Serializable {

    @ApiParam(value = "城市ID")
    @DefaultValue("0")
    @QueryParam("cityId")
    private Integer cityId;

    @ApiParam(value = "公司ID")
    @DefaultValue("0")
    @QueryParam("companyId")
    private Integer companyId;

    @ApiParam(value = "门店ID")
    @DefaultValue("0")
    @QueryParam("shopId")
    private Integer shopId;

    @ApiParam(value = "经纪人状态类型 5：全部 0未注册，1已注册，2签约，3禁用，4离职申请")
    @DefaultValue("5")
    @QueryParam("brokerStatus")
    private Integer brokerStatus;

    @ApiParam(value = "经纪人性别：0全部 1男 2女")
    @DefaultValue("0")
    @QueryParam("gender")
    private Integer gender;

    @ApiParam(value = "婚姻状态：0单身1未婚2已婚3离异4全部")
    @DefaultValue("4")
    @QueryParam("hasMarriage")
    private Integer hasMarriage;

    @ApiParam(value = "从业年限:0：全部、1：1年以下、2：1年、3：2年、4：3-5年、5：6年及以上")
    @DefaultValue("0")
    @QueryParam("workingYears")
    private Integer workingYears;

    @ApiParam(value = "年龄：0：全部、1：20岁及以下、2：21—25岁、3：26—30岁、4：31—35岁、5：36岁及以上")
    @DefaultValue("0")
    @QueryParam("age")
    private Integer age;


    @ApiParam(value = "经纪人类型：0：全部，1：自由经纪人 2：门店经纪人")
    @DefaultValue("0")
    @QueryParam("brokerRole")
    private Integer brokerRole;

    @ApiParam(value = "学历：0：全部，1：高中/中专一下，2：高中/中专，3：大专，4：本科，5：硕士以上")
    @DefaultValue("0")
    @QueryParam("education")
    private Integer education;

    @ApiParam(value = "经纪人姓名")
    @DefaultValue("")
    @QueryParam("brokerName")
    private String brokerName;

    private Date ageStartDate;
    private Date ageEndDate;

    private Date workStartDate;
    private Date workEndDate;

    public Date getAgeStartDate() {
        if (age == null || age == 0) {
            return ResultUtils.addDay(2000);
        } else if (age == 1) {
            return ResultUtils.addDay(2000);
        } else if (age == 2) {
            return ResultUtils.addDay(-21);
        } else if (age == 3) {
            return ResultUtils.addDay(-26);
        } else if (age == 4) {
            return ResultUtils.addDay(-31);
        } else if (age == 5) {
            return ResultUtils.addDay(-36);
        } else {
            return ResultUtils.addDay(2000);
        }
    }

    public Date getAgeEndDate() {
        if (age == null || age == 0) {
            return ResultUtils.addDay(-2000);
        } else if (age == 1) {
            return ResultUtils.addDay(-20);
        } else if (age == 2) {
            return ResultUtils.addDay(-25);
        } else if (age == 3) {
            return ResultUtils.addDay(-30);
        } else if (age == 4) {
            return ResultUtils.addDay(-35);
        } else if (age == 5) {
            return ResultUtils.addDay(-2000);
        } else {
            return ResultUtils.addDay(-2000);
        }
    }

    public Date getWorkStartDate() {
        if (age == null || age == 0) {
            return ResultUtils.addDay(2000);
        } else if (age == 1) {
            return ResultUtils.addDay(2000);
        } else if (age == 2) {
            return ResultUtils.addDay(-1);
        } else if (age == 3) {
            return ResultUtils.addDay(-2);
        } else if (age == 4) {
            return ResultUtils.addDay(-3);
        } else if (age == 5) {
            return ResultUtils.addDay(-6);
        } else {
            return ResultUtils.addDay(2000);
        }
    }

    public Date getWorkEndDate() {
        if (age == null || age == 0) {
            return ResultUtils.addDay(-2000);
        } else if (age == 1) {
            return ResultUtils.addDay(-1);
        } else if (age == 2) {
            return ResultUtils.addDay(-2);
        } else if (age == 3) {
            return ResultUtils.addDay(-3);
        } else if (age == 4) {
            return ResultUtils.addDay(-6);
        } else if (age == 5) {
            return ResultUtils.addDay(-2000);
        } else {
            return ResultUtils.addDay(-2000);
        }
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getHasMarriage() {
        return hasMarriage;
    }

    public void setHasMarriage(Integer hasMarriage) {
        this.hasMarriage = hasMarriage;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getBrokerStatus() {
        return brokerStatus;
    }

    public void setBrokerStatus(Integer brokerStatus) {
        this.brokerStatus = brokerStatus;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(Integer workingYears) {
        this.workingYears = workingYears;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBrokerRole() {
        return brokerRole;
    }

    public void setBrokerRole(Integer brokerRole) {
        this.brokerRole = brokerRole;
    }
}
