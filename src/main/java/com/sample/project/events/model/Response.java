package com.sample.project.events.model;

import java.lang.*;

public class Response {

    private int code;

    private String message = "";

    private com.sample.project.events.model.Error error;

    public Response(int code, String message, com.sample.project.events.model.Error error) {
        this.code = code;
        this.message = message;
        this.error = error;
    }

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(int code) {
        this.code = code;
    }

    public Response(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public com.sample.project.events.model.Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
