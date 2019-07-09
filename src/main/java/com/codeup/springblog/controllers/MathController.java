package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping(path = "/add/{num1}/and/{num2}/")
    @ResponseBody
    public String add(@PathVariable double num1, @PathVariable double num2) {
        return num1 + " plus " + num2 + " equals " + (num1 + num2);
    }

    @GetMapping("/subtract/{num1}/from/{num2}/")
    @ResponseBody
    public String subtract(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " minus " + num2 + " equals " + (num1 - num2);
    }

    @GetMapping("/multiply/{num1}/by/{num2}/")
    @ResponseBody
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " multipled by " + num2 + " equals " + (num1 * num2);
    }

    @GetMapping("/divide/{num1}/by/{num2}/")
    @ResponseBody
    public String divide(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " divided by " + num2 + " equals " + (num1 / num2);
    }
}
