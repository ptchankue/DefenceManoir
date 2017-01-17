package mil.cm.navy.controller;

import mil.cm.navy.form.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * Created by patricktchankue on 11/15/16.
 * @author Patrick Tchankue
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String index(Model model){

        model.addAttribute("message", "My message passed from the controller");

        ArrayList<String> articles = new ArrayList<String>();
        articles.add("Article 1"); articles.add("Article 2"); articles.add("Article 3"); articles.add("Article 4");
        model.addAttribute("articles", articles);

        return "index";
    }


    @RequestMapping("/bootstrap")
    public String bootstrapExample(){
        return "bootstrap/index";
    }
}
