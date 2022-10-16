package com.example.demo.page;

import com.example.demo.appuser.AppUser;
import com.example.demo.appuser.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    private AppUserService service;

    @GetMapping("/")
    public String login(){
        return "home.html";
    }

    @GetMapping("/login")
    public String logIn(){
        return "login.html";
    }

//    @RequestMapping(value = "/username", method = RequestMethod.GET)
//    @ResponseBody
//        public String currentUserName(Principal principal, Model model){
//
//        Optional<AppUser> user = service.listParticularUser(principal.getName());
//        model.addAttribute("firstName", user.get().getFirstName());
//        model.addAttribute("lastName", user.get().getLastName());
//        model.addAttribute("mail", user.get().getEmail());
//        return "username.html";
//    }

}
