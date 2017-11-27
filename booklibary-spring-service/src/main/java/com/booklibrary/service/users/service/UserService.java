package com.booklibrary.service.users.service;

import com.booklibrary.service.users.model.UserTO;

import javax.annotation.Resource;

@Resource(name="UserService")
public interface UserService {

    void addUser(UserTO userTO);

    boolean checkUser(String username);

    boolean validateUser(String username, String password);

    String getUserRole(long id);

    UserTO getUserById(long id);

    long getUserId(String username);


}
