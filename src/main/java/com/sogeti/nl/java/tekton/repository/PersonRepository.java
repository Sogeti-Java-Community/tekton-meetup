package com.sogeti.nl.java.tekton.repository;

import com.sogeti.nl.java.tekton.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {}
