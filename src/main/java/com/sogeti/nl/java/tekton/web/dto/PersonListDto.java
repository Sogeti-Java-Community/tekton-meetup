package com.sogeti.nl.java.tekton.web.dto;

import lombok.Data;

import java.util.List;

@Data
public class PersonListDto {
    private List<PersonDto> persons;
    private int count;
}
