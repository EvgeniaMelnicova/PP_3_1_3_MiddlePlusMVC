package ru.morrigan.spring.boot.security.bootstrap.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.morrigan.spring.boot.security.bootstrap.service.UserService;

@AllArgsConstructor
@RequestMapping("/")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String userInfo(Model model) {
        final UserDetails user = (UserDetails)
                SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "users/user_page";
    }
}
