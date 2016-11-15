package mil.cm.navy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by patricktchankue on 11/15/16.
 */
@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login(){
        return "login/login";
    }

}
