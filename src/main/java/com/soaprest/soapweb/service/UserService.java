package com.soaprest.soapweb.service;

import org.springframework.stereotype.Service;
import uz.ws.bankmail.User;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize(){
        User ulug = new User();
        ulug.setName("Ulug");
        ulug.setEmployeeId(771);
        ulug.setDepartment("IT");
        ulug.setEmail("ulug@mail.uz");
        ulug.setSalary(2000);

        User ravshan = new User();
        ravshan.setName("Ravshan");
        ravshan.setEmployeeId(445);
        ravshan.setDepartment("Marketing");
        ravshan.setEmail("ravshan@mail.uz");
        ravshan.setSalary(2100);

        User bahrom = new User();
        bahrom.setName("Bahrom");
        bahrom.setEmployeeId(747);
        bahrom.setDepartment("DBUO");
        bahrom.setEmail("bahrom@mail.uz");
        bahrom.setSalary(3);

        User voris = new User();
        voris.setName("Voris");
        voris.setEmployeeId(720);
        voris.setDepartment("Aparat");
        voris.setEmail("voris@mail.uz");
        voris.setSalary(1900);

        users.put(ulug.getName(),ulug);
        users.put(ravshan.getName(),ravshan);
        users.put(bahrom.getName(),bahrom);
        users.put(voris.getName(),voris);
    }

    public User getUsers(String name){
        return users.get(name);
    }


}
