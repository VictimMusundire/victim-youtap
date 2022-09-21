package com.victim.victimtapapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @Author Victim Musundire
 * @Date 9/21/2022 3:58 AM
 * @Version 1.0
 */

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException userNotFoundException, WebRequest webRequest){
        ExceptionDetails exceptionDetails = new ExceptionDetails(-1,userNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }
}
