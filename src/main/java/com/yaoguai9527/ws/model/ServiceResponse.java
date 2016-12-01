package com.yaoguai9527.ws.model;

import lombok.Data;

/**
 * Created by Chuang on 2016/11/28.
 */
@Data
public class ServiceResponse {
    Message message;

    public ServiceResponse(Message message){
        this.message = message;
    }
}
