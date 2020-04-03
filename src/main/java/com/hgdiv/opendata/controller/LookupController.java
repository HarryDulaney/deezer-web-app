package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Person;
import com.hgdiv.opendata.repository.HomeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class LookupController {

    private static final String template = "Is this the person you are looking for, %s?";
    private final AtomicLong counter = new AtomicLong();
    private final HomeRepository homeRepository;

    LookupController(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }


    @GetMapping(value = "/persons")
    public List<Person> all() {
        return homeRepository.findAll();
    }

    @PostMapping("/person")
    Person newPerson(@RequestBody Person newPerson) {
        return homeRepository.save(newPerson);
    }


    @GetMapping(value = "/person/{id}")
    Person single(@PathVariable Long id) {

        return homeRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    @PutMapping("/person/{id}")
    Person replacePerson(@RequestBody Person newPerson, @PathVariable Long id) {

        return homeRepository.findById(id)
                .map(person -> {
                    person.setFirstName(newPerson.getFirstName());
                    person.setDescription(newPerson.getDescription());
                    return homeRepository.save(person);
                })
                .orElseGet(() -> {
                    newPerson.setId(id);
                    return homeRepository.save(newPerson);
                });
    }

    @DeleteMapping("/persons/{id}")
    void deleteEmployee(@PathVariable Long id) {
        homeRepository.deleteById(id);
    }
}
