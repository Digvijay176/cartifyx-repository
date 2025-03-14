package com.digvijay.cartifyx.comman.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorClass {
    private String field;
    private String errorCode;
    private String message;
}
