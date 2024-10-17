package com.imccabe.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class WelcomeController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model) {
        model.put("username", "Hardcoded Value");
        return "welcome";
    }

}
