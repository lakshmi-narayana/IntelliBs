package com.bis.controller;

import java.util.ArrayList;

import com.bis.dto.UserDto;
import com.bis.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);
    
    @Autowired
    UserService userService;
    
    public String getUsers(Model model){
        logger.debug("Inside UserController getUsers");
        ArrayList<UserDto> userList = userService.getAll();
        model.addAttribute("users",userList);
        return "welcome";
    }
}