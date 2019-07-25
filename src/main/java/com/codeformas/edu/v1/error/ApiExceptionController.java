package com.codeformas.edu.v1.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionController {
    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity<Object> exception(ApiException exception) {
        ResponseEntity result = ResponseEntity.status(exception.getHttpStatus()).body(exception);
        return result;
    }
}
