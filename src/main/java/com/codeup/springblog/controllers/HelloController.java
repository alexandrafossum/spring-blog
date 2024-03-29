package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping(path = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello";
    }
//
//    @GetMapping("/goodbye")
//    @ResponseBody
//    public String goodbye() {
//        return "Goodbye";
//    }
//
//    // Path variables
//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String helloName(@PathVariable String name) {
//        return "Hello, " + name;
//    }
//
//    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOne(@PathVariable int number) {
//        return number + " plus one is " + (number + 1) + "!";
//    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

}
