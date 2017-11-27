package com.booklibrary.service.users.dao;

import com.booklibrary.service.users.model.UserTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import org.hibernate.Query;

/**
 * Created by Aliaksandr_Trafimovi on 11/14/2017.
 */

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    private static final String USERNAME = "username";

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }



    @Override
    public void addUser(UserTO userTO) {
        Session session = getSession();
        session.beginTransaction();
        session.save(userTO);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public boolean checkUsername(String username) {
        boolean isExist = true;
        Session session = getSession();
        session.beginTransaction();
        Query query = session.createQuery("from UserTO where username = :username");
        query.setParameter(USERNAME, username);
        if (query.list().isEmpty()) {
            isExist=false;
        }
        session.close();
        return isExist;
    }

    @Override
    public boolean validateUser(String username, String password) {
        boolean isValidated = false;
        Session session = getSession();
        session.beginTransaction();
        Query query = session.createQuery("from UserTO where username = :username and password = :password");
        query.setParameter(USERNAME, username);
        query.setParameter("password", password);
        if (!query.list().isEmpty()) {
            isValidated=true;
        }
        session.close();
        return isValidated;
    }

    @Override
    public String getUserRole(long id) {
        Session session = getSession();
        session.beginTransaction();
        Query query = session.createSQLQuery("SELECT role_name FROM user_roles join user_role_mapping on user_roles.id = user_role_mapping.role_id where user_role_mapping.user_id = :id");
        query.setParameter("id",id);
        String role = (String) query.uniqueResult();
        session.close();
        return role;
    }

    @Override
    public UserTO getUserById(long id) {
        Session session = getSession();
        session.beginTransaction();
        UserTO userTO = (UserTO) session.get(UserTO.class, id);
        session.close();
        return userTO;
    }

    @Override
    public long getUserId(String username) {
        Session session = getSession();
        session.beginTransaction();
        Query query = session.createQuery("from UserTO  where username = :username");
        query.setParameter(USERNAME, username);
        UserTO userTO = (UserTO) query.uniqueResult();
        long userId = userTO.getId();
        session.close();
        return userId;
    }
}
