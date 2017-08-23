package com.aastu.controller;

import com.aastu.model.Users;
import com.aastu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Fraol on 8/17/2017.
 */

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/manageUsers" , method = RequestMethod.GET)
    public ModelAndView manageUsers() {
        ModelAndView modelAndView = new ModelAndView();
        Users user = new Users();
        modelAndView.addObject("user", user);
        modelAndView.addObject("userLists", userService.getAllUsers());
        modelAndView.setViewName("/manageUsers");
        return modelAndView;

    }

    @RequestMapping(path="/manageUsers/delete/{id}" , method = RequestMethod.GET)
    public ModelAndView deleteUsers(@PathVariable Integer id) {
        ModelAndView modelAndView=new ModelAndView();
        try {
            userService.delete(id);

            modelAndView.addObject("msgSuccess","Successfully deleted");
        }
        catch (Exception ex) {
            modelAndView.addObject("msgError","error deleting a user");

        }
            Users user = new Users();
            modelAndView.addObject("user", user);
            modelAndView.addObject("userLists", userService.getAllUsers());
            modelAndView.setViewName("/manageUsers");
        return modelAndView;
    }
    @RequestMapping(path="/manageUsers/edit/{id}" , method = RequestMethod.GET)
    public ModelAndView editUsers(@PathVariable Integer id) {
        ModelAndView modelAndView=new ModelAndView();
        try {
            userService.findUserByUsername("d");
            modelAndView.addObject("msgSuccess","Successfully deleted");
        }
        catch (Exception ex) {
            modelAndView.addObject("msgError","error deleting a user");

        }
            Users user = new Users();
            modelAndView.addObject("user", user);
            modelAndView.addObject("userLists", userService.getAllUsers());
            modelAndView.setViewName("/manageUsers");
        return modelAndView;
    }


    @RequestMapping( "/record" )
    public ModelAndView record() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("/Record");
        return modelAndView;

    }



    @RequestMapping(path="/users", method= RequestMethod.GET)
    public ModelAndView getAllUsers() {

        ModelAndView mav = new ModelAndView("message/list");
        mav.addObject("messages", userService.getAllUsers());
        return mav;

    }
}
