package br.com.brenomp.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String ex) {
        super(ex);
    }
}
