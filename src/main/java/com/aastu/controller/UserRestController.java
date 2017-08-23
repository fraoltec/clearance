package com.aastu.controller;

import com.aastu.model.Users;
import com.aastu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Column;
import java.util.List;

/**
 * Created by Fraol on 8/21/2017.
 */
@RestController
public class UserRestController {

/*    @Autowired
    private UserService userService;

    @RequestMapping(path="/users", method= RequestMethod.GET)
    public List<Users> getAllUsers() {

        ModelAndView mav = new ModelAndView("message/list");
        mav.addObject("messages", userService.getAllUsers());
        return mav;

    }*/

}
