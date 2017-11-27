package com.booklibrary.web.controllers.users;

import com.booklibrary.service.users.model.UserTO;
import com.booklibrary.service.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String userLogin(ModelMap modelMap){
        UserTO userTO = new UserTO();
        modelMap.addAttribute(userTO);
    return "login";
    }






}
