package com.exigen.tst.common.config;

/**
 * Test exdception.
 *
 * @author astorhs
 */
public class TstException extends RuntimeException {

    /**
     * Constructs test exception with given message.
     *
     * @param message exception message
     */
    public TstException(String message) {
        super(message);
    }

    /**
     * Constructs test exception with given message and cause.
     *
     * @param message exception message
     * @param cause   exception cause
     */
    public TstException(String message, Throwable cause) {
        super(message, cause);
    }

}
