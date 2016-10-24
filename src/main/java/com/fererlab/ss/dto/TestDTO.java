package com.fererlab.ss.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Random;

@XmlRootElement
public class TestDTO {

    private String message = "random";
    private Double number = new Random().nextDouble();

    public TestDTO() {
    }

    public TestDTO(String message, Double number) {
        this.message = message;
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
}
