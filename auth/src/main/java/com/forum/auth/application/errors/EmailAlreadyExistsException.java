package com.forum.auth.application.errors;

public class EmailAlreadyExistsException extends RuntimeException {
    private String code;
    public EmailAlreadyExistsException(String message) {
        super(message);
        this.code = "email_already_exists_exception";
    }
}
