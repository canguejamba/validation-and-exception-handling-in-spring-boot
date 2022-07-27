package io.startervalidation.request.exception;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.Map;

public record ArgumentValidationUtils() {

    public static Map<String, String> errors(MethodArgumentNotValidException argumentViolation){

        Map<String, String> errors = new HashMap<>();
        argumentViolation.getBindingResult().getAllErrors().forEach(
                (error) -> {
                    String fieldName = ((FieldError)error).getField();
                    String message = error.getDefaultMessage();
                    errors.put(fieldName, message);

                }
        );

         return errors;
    }
}
