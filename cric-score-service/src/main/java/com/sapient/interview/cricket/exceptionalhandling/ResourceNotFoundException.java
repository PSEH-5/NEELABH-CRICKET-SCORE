package com.sapient.interview.cricket.exceptionalhandling;

public class ResourceNotFoundException extends Exception {

    private static final long serialVersionUID = -121212891829811212L;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(final String message) {
        super(message);
    }

}
