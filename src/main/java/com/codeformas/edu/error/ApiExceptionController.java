package com.codeformas.edu.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestControllerAdvice
public class ApiExceptionController {
    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity<Object> exception(ApiException exception) {
        ResponseEntity result = ResponseEntity.status(exception.getHttpStatus()).body(exception);
        return result;
    }
}
