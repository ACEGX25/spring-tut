package com.resident.springtut.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "welcome to the right path";
    }

    @RequestMapping("/about")
    public String about(){
        return " this is the about path ";
    }
}
