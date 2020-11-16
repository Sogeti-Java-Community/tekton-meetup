package com.sogeti.nl.java.tekton.web.controller;

import com.sogeti.nl.java.tekton.domain.Person;
import com.sogeti.nl.java.tekton.repository.PersonRepository;
import com.sogeti.nl.java.tekton.web.dto.PersonListDto;
import com.sogeti.nl.java.tekton.web.dto.mapper.PersonListToDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository repository;

    private final PersonListToDtoMapper mapper;

    public PersonController(PersonRepository repository, PersonListToDtoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @GetMapping
    public PersonListDto list() {
        List<Person> persons = new ArrayList<>();

        repository.findAll().forEach(persons::add);

        return mapper.apply(persons);
    }
}
