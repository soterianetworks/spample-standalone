package com.soterianetworks.spase.sample.machine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MachineNotFoundException extends RuntimeException {

    public MachineNotFoundException() {
    }

    public MachineNotFoundException(String message) {
        super(message);
    }

    public MachineNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MachineNotFoundException(Throwable cause) {
        super(cause);
    }

    public MachineNotFoundException(String message, Throwable cause, boolean enableSuppression,
                                    boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
