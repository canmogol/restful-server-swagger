package com.fererlab.ss.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class LastLoginDTO extends GenericMapDTO<Object> {

    private String ip;
    private Date date;
    private String browser;
    private String operatingSystem;

    public LastLoginDTO() {
    }

    public LastLoginDTO(String ip, Date date, String browser, String operatingSystem) {
        this.ip = ip;
        this.date = date;
        this.browser = browser;
        this.operatingSystem = operatingSystem;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
