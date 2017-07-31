package com.aastu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Abdurahman on 7/31/2017.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String home() {

        return "index";
    }
}