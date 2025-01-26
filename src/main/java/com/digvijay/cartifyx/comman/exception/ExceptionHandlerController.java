package com.digvijay.cartifyx.comman.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDto<String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){

        Map<String,String> resp = new HashMap<String,String>();
        List<ObjectError> errors= ex.getBindingResult().getAllErrors();

        errors.forEach((e)->{
            String fieldName= ((FieldError) e).getField();
            String message  = e.getDefaultMessage();
            resp.put(fieldName,message);
        });
        String message = resp.toString();

        ResponseDto<String> response = new ResponseDto<>();
        response.setMessage(message);
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setMessage(message);

        return ResponseEntity.ok().body(response);
    }
}
