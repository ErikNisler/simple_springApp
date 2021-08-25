package com.test.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    private LoginServices loginServices;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(Model model){
        model.addAttribute("login",new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postLogin(@ModelAttribute LoginForm loginForm){
        loginServices.setLogin(loginForm);
        return "output";
    }
}
