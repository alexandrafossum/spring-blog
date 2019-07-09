package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Create a controller StringTransformController with the following methods
//
//        url = "/string/reverse/{string}"
//        returns = the string reversed
//
//        url = "/string/uppercase/{string}"
//        returns = string in all uppercase letters
//
//        url = "/string/both/string"
//        returns = string reversed in all caps (avoid repeating logic)
//
//        url = "/string/{string}" (with a query string)
//        returns = string reversed or in caps or both based on parameters passed to the Query string
//        (research how to capture Query string values in Spring MVC)
//        (for example... "/string/steve?reverse=true&caps=false" should return "evets")
//
//        3) Create a default message for any uri that is not mapped
//
//        4) Create a default message for any uri that starts with "/wildcard" and has any number of forward slashes and values after

@Controller
public class StringFormController {

    @RequestMapping(path = "/string/reverse")
    @ResponseBody
    public String reverse() {
        return "";
    }
}
