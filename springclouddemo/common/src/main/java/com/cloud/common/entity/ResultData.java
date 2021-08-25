package com.cloud.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 22110334
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultData<T> {
    private Integer code;
    private String message;
    private T data;

    public ResultData(Integer code,String message){
        this(code,message,null);
    }
}
