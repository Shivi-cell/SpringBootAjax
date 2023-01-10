package springbootajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }

    @RequestMapping("/home/addPerson")
    public String addUser()
    {
        return "addPerson";
    }
}