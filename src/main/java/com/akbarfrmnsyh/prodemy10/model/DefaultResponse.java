package com.akbarfrmnsyh.prodemy10.model;

public class DefaultResponse {
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Boolean status;
    private String message;
}
