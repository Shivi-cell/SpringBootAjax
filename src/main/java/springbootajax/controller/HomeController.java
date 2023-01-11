package springbootajax.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import springbootajax.entity.Person;
import springbootajax.service.PersonServiceImpl;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PersonServiceImpl personService;

    @RequestMapping("/home")
    public String home(Model model)
    {
        List<Person> personList = personService.getAll();
        model.addAttribute("personList",personList);
        return "home";
    }

    @RequestMapping("/home/addPerson")
    public String addUser(Model model)
    {
        return "addPerson";
    }

    @RequestMapping(path = "/home/processForm", method = RequestMethod.POST)
    public RedirectView addUserInDataBase(@ModelAttribute("person") Person person)
    {
        RedirectView redirectView = new RedirectView();
        String id = personService.save(person);
        System.out.println("Product has been added"+id);
        redirectView.setUrl("/home");
        return redirectView;
    }

    @RequestMapping("home/deletePerson/{personId}")
    public RedirectView deletePerson(@PathVariable("personId") String personId)
    {
        personService.delete(personId);
        RedirectView rv = new RedirectView();
        rv.setUrl("/home");
        return rv;
    }

    @RequestMapping("home/editDetails/{personId}")
    public String updateForm(@PathVariable("personId") String personId, Model m)
    {
        System.out.println(personId);
        Person person = personService.getPersonById(personId);
        m.addAttribute("person", person);
        return "updatePerson";
    }

    @RequestMapping(path = "/home/editDetails/updatePerson", method = RequestMethod.POST)
    public RedirectView updateDetails(@ModelAttribute("person") Person person)
    {
        RedirectView rv = new RedirectView();
        String id = personService.save(person);
        System.out.println("product updated successfully");
        rv.setUrl("/home");
        return rv;
    }
}
