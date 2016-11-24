package mil.cm.navy.controller;

import mil.cm.navy.Application;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by patricktchankue on 11/15/16.
 */
@Controller
public class LoginController {

    private static Logger myLogger;

    @RequestMapping("/login")
    public String login(){

        return "login/login";
    }

}
