package com.forum.auth.web.dto.errors;

public class DTOException extends RuntimeException {
    private String code;

    public DTOException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
