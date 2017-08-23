package com.aastu.controller;

import com.aastu.model.Users;
import com.aastu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fraol on 8/17/2017.
 */

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value="/dashboard", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/dashboard");
        return modelAndView;
    }

    @RequestMapping( "/requestClearance" )
    public ModelAndView requestClearance() {

        Map<String, Object> model = new HashMap<>();

        return new ModelAndView( "/requestClearance" );

    }
    /////////////////////////////////
//    Registrations are handled below
    /////////////////////////////////
    @RequestMapping(value = "/manageUsers",method = RequestMethod.POST)
    public ModelAndView newUser(@Valid Users user, BindingResult bindingResult)
    {
        ModelAndView modelAndView=new ModelAndView();
        Users userExist=userService.findUserByUsername(user.getUsername());
        if (userExist != null) {
            bindingResult
                    .rejectValue("username", "error.user",
                            "There is already a user registered with the email provided");
        }
        if(bindingResult.hasErrors())
        {
            modelAndView.addObject("ErrorMessage","Something went wrong");
            modelAndView.setViewName("manageUsers");
        }
        else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage","User has been successfully registered");
            modelAndView.addObject("user",new Users());
            modelAndView.setViewName("manageUsers");
        }
        Users users = new Users();
        modelAndView.addObject("user", users);
        modelAndView.addObject("userLists", userService.getAllUsers());
        return modelAndView;
    }


}
