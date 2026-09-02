package com.zen.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import com.zen.payload.response.ExceptionResponse;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler
 {
     @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> ExceptionHandler(Exception exception, WebRequest req) {
        ExceptionResponse response = new ExceptionResponse(
                exception.getMessage()
                , req.getDescription(false),
                LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
}
