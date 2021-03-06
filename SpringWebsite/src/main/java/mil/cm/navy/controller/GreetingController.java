package mil.cm.navy.controller;

import mil.cm.navy.form.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "other/result";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testController(Model model) {
        return "other/test";
    }


}