package com.carfactory.carfactory.util;

import javax.persistence.PersistenceException;

public class CarTypeException extends PersistenceException {
    public CarTypeException() {
        super();
    }

    public CarTypeException(String message) {
        super(message);
    }

    public CarTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarTypeException(Throwable cause) {
        super(cause);
    }
}
