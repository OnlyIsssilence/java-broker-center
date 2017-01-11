package com.tops001.domain.broker.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tops001.domain.common.ResultUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Days;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/2.
 */
@ApiModel(description = "经纪人列表")
public class BrokerResult {
    @ApiModelProperty(value = "经纪人Id")
    private Long brokerId;

    @ApiModelProperty(value = "经纪人姓名")
    private String brokerName;

    @ApiModelProperty(value = "门店ID")
    private Long shopId;

    @ApiModelProperty(value = "门店名称")
    private String shopName;

    @ApiModelProperty(value = "经纪人性别 0未知 1男 2女")
    private Integer gender;

    @ApiModelProperty(value = "经纪人年龄")
    private Integer age;

    @ApiModelProperty(value = "学历 1高中/中专以下，2高中/中专，3大专，4本科，5硕士以上")
    private Integer education;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "从业年限")
    private Integer workingYear;

    @ApiModelProperty(value = "经纪人状态")
    private Integer brokerStatus;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @JsonIgnore
    private Date birthday;

    @JsonIgnore
    private Date workingTime;

    public Date getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(Date workingTime) {
        this.workingTime = workingTime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBrokerStatus() {
        return brokerStatus;
    }

    public void setBrokerStatus(Integer brokerStatus) {
        this.brokerStatus = brokerStatus;
    }

    public Long getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Long brokerId) {
        this.brokerId = brokerId;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }


    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return ResultUtils.calBetweenDateLength(this.birthday);
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getWorkingYear() {
        return ResultUtils.calBetweenDateLength(this.workingTime);
    }

}
