package com.carfactory.carfactory.util;

import lombok.Data;

@Data
public class ExceptionInfo {
    private String errorCode;
    private String message;
    private String messageType;
    private String detailedMessage;
    private String errorPage;
    private String type;
    private String sourceSystem;

    public ExceptionInfo(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
