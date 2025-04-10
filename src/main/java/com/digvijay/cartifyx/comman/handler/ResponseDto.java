package com.digvijay.cartifyx.comman.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {
    private T data;
    private String message;
    private int status;

}
