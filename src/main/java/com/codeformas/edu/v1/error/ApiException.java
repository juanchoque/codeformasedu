package com.codeformas.edu.v1.error;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private HttpStatus httpStatus;
    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public ApiException() {
    }

    public ApiException(Exception e, HttpStatus httpStatus) {
        this.setStackTrace(new StackTraceElement[0]);
        this.httpStatus = httpStatus;
        this.timestamp = LocalDateTime.now();
        this.status = httpStatus.value();
        this.error = e.getLocalizedMessage();
        this.message = e.getMessage();
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
