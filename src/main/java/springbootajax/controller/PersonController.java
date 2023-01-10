package springbootajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springbootajax.entity.Person;
import springbootajax.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public String Save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping
    public List<Person> getPersonStartWith(@RequestParam("name") String name) {
        return personService.getPersonStartWith(name);
    }

    @GetMapping("/age")
    public List<Person> getByPersonAge(@RequestParam Integer minAge, @RequestParam Integer maxAge) {
        return personService.getByPersonAge(minAge, maxAge);
    }

    @GetMapping("/all")
    public List<Person> getAll() {
        return personService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        personService.delete(id);
    }

    @DeleteMapping
    public void deleteAll() {
        personService.deleteAll();
    }

    @PutMapping
    public String updatePerson(@RequestBody Person person) {
        return personService.save(person);
    }

}
