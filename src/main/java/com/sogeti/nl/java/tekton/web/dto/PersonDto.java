package com.sogeti.nl.java.tekton.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonDto {
    @Getter
    private Long id;

    private String firstName;

    private String lastName;

    public static PersonDto from(String firstName, String lastName) {
        PersonDto dto = new PersonDto();
        dto.setFirstName(firstName);
        dto.setLastName(lastName);

        return dto;
    }
}