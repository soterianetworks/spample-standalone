package com.soterianetworks.spase.sample.checking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CheckMachineNotFoundException extends RuntimeException {

    public CheckMachineNotFoundException() {
    }

    public CheckMachineNotFoundException(String message) {
        super(message);
    }

    public CheckMachineNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckMachineNotFoundException(Throwable cause) {
        super(cause);
    }

    public CheckMachineNotFoundException(String message, Throwable cause, boolean enableSuppression,
                                         boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
