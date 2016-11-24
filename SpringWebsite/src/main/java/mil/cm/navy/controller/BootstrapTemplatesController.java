package mil.cm.navy.controller;

import mil.cm.navy.form.Greeting;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by patricktchankue on 11/23/16.
 */
@Controller
public class BootstrapTemplatesController {

    private static Logger myLogger;

    @RequestMapping(value = "/moderna", method = RequestMethod.GET)
    public String greetingSubmit(@ModelAttribute Greeting greeting) {

        myLogger = Logger.getLogger(LoginController.class.getName());

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserName = authentication.getName();

            myLogger.log(Level.INFO, currentUserName);
        }

        return "bootstrap/moderna";
    }
}
