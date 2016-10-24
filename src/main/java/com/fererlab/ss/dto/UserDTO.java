package com.fererlab.ss.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDTO extends GenericMapDTO<Object> {

    private String name;
    private String username;
    private String address;
    private String mobilePhone;
    private String mail;

    public UserDTO() {
    }

    public UserDTO(String name, String username, String address, String mobilePhone, String mail) {
        this.name = name;
        this.username = username;
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
