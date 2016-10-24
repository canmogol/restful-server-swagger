package com.fererlab.ss.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginResponseDTO extends ResponseDTO {

    private UserDTO userDTO;
    private LastLoginDTO lastLoginDTO;

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public LastLoginDTO getLastLoginDTO() {
        return lastLoginDTO;
    }

    public void setLastLoginDTO(LastLoginDTO lastLoginDTO) {
        this.lastLoginDTO = lastLoginDTO;
    }

}
