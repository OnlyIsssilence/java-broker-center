package com.tops001.httpInvoker.entity;

import com.tops001.core.component.http.annotation.DotNetEntity;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2016/7/26.
 */
@DotNetEntity
public class OpenIDs {
    private String broker;

    private String easemobadmin;

    private String easemobbroker;

    private String easemobkber;

    private String EasemobAdmin;

    private String EasemobBroker;

    private String EasemobKber;

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getEasemobadmin() {
        if (StringUtils.isNotBlank(easemobadmin)) {
            return easemobadmin;
        } else {
            return EasemobAdmin;
        }
    }

    public void setEasemobadmin(String easemobadmin) {
        this.easemobadmin = easemobadmin;
    }

    public String getEasemobbroker() {
        if (StringUtils.isNotBlank(easemobbroker)) {
            return easemobbroker;
        } else {
            return EasemobBroker;
        }
    }

    public void setEasemobbroker(String easemobbroker) {
        this.easemobbroker = easemobbroker;
    }

    public String getEasemobkber() {
        if (StringUtils.isNotBlank(easemobkber)) {
            return easemobkber;
        } else {
            return EasemobKber;
        }
    }

    public void setEasemobkber(String easemobkber) {
        this.easemobkber = easemobkber;
    }

    // public String getEasemobAdmin() {
    // return EasemobAdmin;
    // }

    public void setEasemobAdmin(String easemobAdmin) {
        EasemobAdmin = easemobAdmin;
    }

    // public String getEasemobBroker() {
    // return EasemobBroker;
    // }

    public void setEasemobBroker(String easemobBroker) {
        EasemobBroker = easemobBroker;
    }

    // public String getEasemobKber() {
    // return EasemobKber;
    // }

    public void setEasemobKber(String easemobKber) {
        EasemobKber = easemobKber;
    }
}
