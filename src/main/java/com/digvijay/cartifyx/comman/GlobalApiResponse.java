package com.digvijay.cartifyx.comman;

import com.digvijay.cartifyx.comman.error.ErrorClass;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalApiResponse<T> {
    private String status;
    private String message;
    private T data;
    private long timestamp;
//  private PageInfo pageInfo;
    private String errorCode;
    List<ErrorClass> errorList;

    private Map<String, String> metadata;
    public GlobalApiResponse(String success, String message, T data) {
        this.status=success;
        this.message=message;
        this.data= data;
    }
}
