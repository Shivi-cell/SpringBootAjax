package springbootajax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootajax.entity.Person;
import springbootajax.repository.PersonRepository;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> getPersonStartWith(String name) {
        List<Person> byFirstNameStartsWith = personRepository.findByFirstNameStartsWith(name);
        return byFirstNameStartsWith;
    }

    @Override
    public void delete(String id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
        List<Person> byAgeBetween = personRepository.findPersonByAgeBetween(minAge, maxAge);
        return byAgeBetween;
    }

    @Override
    public void deleteAll() {
        personRepository.deleteAll();
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

}