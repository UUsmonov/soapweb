package com.soaprest.soapweb.endpoint;

import com.soaprest.soapweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.*;
import uz.ws.bankmail.RecvUser;
import uz.ws.bankmail.SendUser;
import uz.ws.bankmail.User;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace="http://BankMail.ws.uz/",localPart = "recvUser")
    @ResponsePayload
    public SendUser recvUser(@RequestPayload RecvUser request){
        SendUser response = new SendUser();
//        response.setBankPojo();
/*
        User user = new User();
        user.setName("aaaa");
        user.setEmployeeId(11);
        user.setSalary(4400);
        user.setDepartment("dddd");
        user.setEmail("u@u.u");
        response.setUser(user);
*/
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}
