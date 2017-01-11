package com.tops001.httpInvoker.entity;

import com.tops001.core.component.http.annotation.DotNetEntity;

/**
 * Created by Administrator on 2016/7/26.
 */
@DotNetEntity
public class OAuthEntity {
    private int     LoginType;

    private String  UpdatedTime;

    private OpenIDs OpenIDs;

    private String  CrmUserID;

    private String  BrokerID;

    private long    ID;

    private String  UserToken;

    private String  Name;

    private String  Phone;

    private String  NickName;

    private String  Image;

    private Boolean Sex;

    public Boolean getSex() {
        return Sex;
    }

    public void setSex(Boolean sex) {
        Sex = sex;
    }

    public int getLoginType() {
        return LoginType;
    }

    public void setLoginType(int loginType) {
        LoginType = loginType;
    }

    public String getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        UpdatedTime = updatedTime;
    }

    public OpenIDs getOpenIDs() {
        return OpenIDs;
    }

    public void setOpenIDs(OpenIDs openIDs) {
        OpenIDs = openIDs;
    }

    public String getCrmUserID() {
        return CrmUserID;
    }

    public void setCrmUserID(String crmUserID) {
        CrmUserID = crmUserID;
    }

    public String getBrokerID() {
        return BrokerID;
    }

    public void setBrokerID(String brokerID) {
        BrokerID = brokerID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public String getUserToken() {
        return UserToken;
    }

    public void setUserToken(String userToken) {
        UserToken = userToken;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
