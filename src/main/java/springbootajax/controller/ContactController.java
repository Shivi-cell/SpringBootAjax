/*
package springbootajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springbootajax.entity.User;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String showForm()
    {
        return "Contact";
    }
    */
/*@RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String processForm(@RequestParam("email") String email,
                              @RequestParam("userName") String userName,
                              @RequestParam("password") String password, Model model)
    {
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);

//        model.addAttribute("email", email);
//        model.addAttribute("userName", userName);
//        model.addAttribute("password", password);
        model.addAttribute("user", user);
        return "success";
    }*//*


    // using @ModelAttribute
    @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model)
    {
        //model.addAttribute("user", user);
        return "success";
    }
}
*/
