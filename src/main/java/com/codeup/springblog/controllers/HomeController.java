package com.codeup.springblog.controllers;

import com.codeup.springblog.repos.PostRepository;
import com.codeup.springblog.services.EmailService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private PostRepository postDao;
    private EmailService emailSvc;

    public HomeController(PostRepository postDao, EmailService emailSvc) {
        this.postDao = postDao;
        this.emailSvc = emailSvc;
    }

    @GetMapping("/")
    public String returnHomePage(Model model) {
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return "home";
    }

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }

    @GetMapping("/email-test")
    @ResponseBody
    public String emailTest() {
        emailSvc.prepareAndSend(postDao.findOne(3L));
        return "testing email...";
    }
}
