package com.carfactory.carfactory.util;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorInfo {
    private String type;
    private String message;
}
