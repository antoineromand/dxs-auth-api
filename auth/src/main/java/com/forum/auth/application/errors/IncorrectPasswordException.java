package com.forum.auth.application.errors;

public class IncorrectPasswordException extends RuntimeException {
    private String code;
    public IncorrectPasswordException(String message) {
        super(message);
        this.code = "incorrect_password";
    }
}
