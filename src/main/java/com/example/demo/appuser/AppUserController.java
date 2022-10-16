package com.example.demo.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
public class AppUserController {

    @Autowired
    private AppUserService service;

    @GetMapping("/users")
    public String showUserList(Model model){
        List<AppUser> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }


    @GetMapping("/username")
    public String currentUserName(Principal principal, Model model){
        Optional<AppUser> user = service.listParticularUser(principal.getName());
        model.addAttribute("firstName", user.get().getFirstName());
        model.addAttribute("lastName", user.get().getLastName());
        model.addAttribute("mail", user.get().getEmail());
        return "username";
    }
}
