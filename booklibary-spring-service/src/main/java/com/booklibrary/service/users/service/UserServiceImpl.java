package com.booklibrary.service.users.service;


import com.booklibrary.service.users.dao.UserDao;
import com.booklibrary.service.users.model.UserTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Aliaksandr_Trafimovi on 11/14/2017.
 */

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public void addUser(UserTO userTO) {
        userDao.addUser(userTO);

    }

    @Override
    public boolean checkUser(String username) {
        return userDao.checkUsername(username);
    }

    @Override
    public boolean validateUser(String username, String password) {
        return userDao.validateUser(username,password);
    }

    @Override
    public String getUserRole(long id) {
        return userDao.getUserRole(id);
    }

    @Override
    public UserTO getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public long getUserId(String username) {
        return userDao.getUserId(username);
    }
}
