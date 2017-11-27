package com.booklibrary.service.users.dao;


import com.booklibrary.service.users.model.UserTO;

public interface UserDao {


    void addUser(UserTO userTO);

    boolean validateUser(String username, String password);

    boolean checkUsername(String username);

    long getUserId(String username);

    UserTO getUserById(long id);

    String getUserRole(long id);
}
