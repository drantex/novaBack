package com.novatec.backend.common;

/**
 * Clase manejadora de errores
 */
public class CoreException extends Exception {
    
    private final ResponseEnum error;

    public ResponseEnum getError() {
        return error;
    }

    public CoreException(ResponseEnum errormessage) {
        error = errormessage;
    }

    public CoreException(ResponseEnum errormessage, Throwable cause) {
        super(errormessage.name(), cause);
        error = errormessage;
    }
}
