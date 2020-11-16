package com.sogeti.nl.java.tekton.web.dto.mapper;

import com.sogeti.nl.java.tekton.domain.Person;
import com.sogeti.nl.java.tekton.web.dto.PersonListDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PersonListToDtoMapper implements Function<List<Person>, PersonListDto> {

    private final PersonToDtoMapper mapper;

    public PersonListToDtoMapper(PersonToDtoMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public PersonListDto apply(List<Person> people) {
        PersonListDto dto = new PersonListDto();

        dto.setPersons(people.stream().map(mapper).collect(Collectors.toList()));
        dto.setCount(people.size());

        return dto;
    }
}
