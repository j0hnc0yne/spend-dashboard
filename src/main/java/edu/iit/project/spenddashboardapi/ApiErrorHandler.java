package edu.iit.project.spenddashboardapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiErrorHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(value = { UserNotFoundException.class })
    protected ResponseEntity<Object> handleNotFound(UserNotFoundException ex) {
        return ResponseEntity.notFound().build();
    }
}
