package com.carfactory.carfactory.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class BaseResponse<T> {
    private T data;
    private boolean success =true;
    private ExceptionInfo error;

    public BaseResponse(T data) {
        this.data = data;
    }

    public BaseResponse(T data, boolean success) {
        this.data = data;
        this.success = success;
    }

    public BaseResponse(T data, boolean success, ExceptionInfo error) {
        this.data = data;
        this.success = success;
        this.error = error;
    }
}
