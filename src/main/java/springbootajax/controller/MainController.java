/*
package springbootajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home(Model model)
    {
        model.addAttribute("name", "Shivam Chaubey 21");
        return "home";
    }
    @RequestMapping("/help")
    public ModelAndView help()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("help");
        modelAndView.addObject("name", "Shivam Chaubey");
        modelAndView.addObject("roll", 2541);
        return modelAndView;
    }
}
*/
