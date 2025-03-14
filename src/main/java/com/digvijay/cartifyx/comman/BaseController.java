package com.digvijay.cartifyx.comman;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class BaseController {

    protected <T> ResponseEntity<GlobalApiResponse<T>> createSuccessResponse(T data, String message) {
        GlobalApiResponse<T> response = new GlobalApiResponse<>("success", message, data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    protected <T> ResponseEntity<GlobalApiResponse<T>> createErrorResponse(String message) {
        GlobalApiResponse<T> response = new GlobalApiResponse<>("error", message, null);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
