package com.demo.springreact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    @RequestMapping(value = {"/", "/anotherPage"}, method = RequestMethod.GET)
    public String reactAppRoutes() {
        return "index";
    }
}
