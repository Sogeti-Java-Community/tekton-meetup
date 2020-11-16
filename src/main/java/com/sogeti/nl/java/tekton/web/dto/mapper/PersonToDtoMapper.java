package com.sogeti.nl.java.tekton.web.dto.mapper;

import com.sogeti.nl.java.tekton.domain.Person;
import com.sogeti.nl.java.tekton.web.dto.PersonDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PersonToDtoMapper implements Function<Person, PersonDto> {
    @Override
    public PersonDto apply(Person person) {
        return PersonDto.from(person.getFirstName(), person.getLastName());
    }
}
