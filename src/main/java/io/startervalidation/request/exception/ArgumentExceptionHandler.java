/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: validation-and-exception-handling-in-spring-boot
 */
package io.startervalidation.request.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Map;

@RestControllerAdvice
public class ArgumentExceptionHandler extends ResponseEntityExceptionHandler {

    // Argument Not Valid
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request
    ){

        Map<String, String> errors = ArgumentValidationUtils.errors(ex);

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }





}
