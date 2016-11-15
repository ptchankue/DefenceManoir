package mil.cm.navy.controller;

import mil.cm.navy.form.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by patricktchankue on 11/15/16.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewPost(@Valid Post post, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        // model.addAttribute("post", new Post());
        model.addAttribute("title", post.getTitle());
        model.addAttribute("content", post.getContent());
        return "result";
    }

    @RequestMapping("/bootstrap")
    public String bootstrapExample(){
        return "bootstrap/index";
    }
}
