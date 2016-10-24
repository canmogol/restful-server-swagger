package com.fererlab.ss.dto;

public class ResponseDTO {

    private ResponseStatus responseStatus = ResponseStatus.SUCCESS;
    private String message = "";
    private Integer errorCode = 1;

    public ResponseDTO() {
    }

    public ResponseDTO(ResponseStatus responseStatus, String message, Integer errorCode) {
        this.responseStatus = responseStatus;
        this.message = message;
        this.errorCode = errorCode;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public static ResponseDTO fail(String message) {
        return new ResponseDTO(ResponseStatus.ERROR, message, 0);
    }
}
