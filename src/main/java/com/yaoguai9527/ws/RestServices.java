package com.yaoguai9527.ws;

import com.yaoguai9527.ws.model.ServiceRequest;
import com.yaoguai9527.ws.model.ServiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chuang on 2016/11/28.
 */
@RestController
@Slf4j
public class RestServices {
    @RequestMapping(method = RequestMethod.POST, value = "/simpleData")
    public ServiceResponse getSimpleData(@RequestBody ServiceRequest serviceRequest){
        serviceRequest.getMessage().setContext("Message received as : " + serviceRequest.getMessage().getContext());
        return new ServiceResponse(serviceRequest.getMessage());
    }

}
