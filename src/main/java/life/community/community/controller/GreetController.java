package life.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class GreetController {

    @RequestMapping("/greet")
    public String greet(@RequestParam(name="name") String name, Model model){
        model.addAttribute("name",name);
        return "greeting";

    }

}
