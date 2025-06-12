package br.com.brenomp.exceptions;

import java.io.Serial;

public class RequiredObjectIsNullException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public RequiredObjectIsNullException() {
        super("It is not allowed to persist a null object!");
    }

    public RequiredObjectIsNullException(String ex) {
        super(ex);
    }
}
