package com.sogeti.nl.java.tekton;

import com.sogeti.nl.java.tekton.domain.Person;
import com.sogeti.nl.java.tekton.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TektonApplication implements ApplicationRunner {
    final PersonRepository repository;

    public TektonApplication(PersonRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TektonApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person mark = new Person();
        mark.setFirstName("Mark");
        mark.setLastName("van der Walle");

        Person dennis = new Person();
        dennis.setFirstName("Dennis");
        dennis.setLastName("Geurts");

        repository.save(mark);
        repository.save(dennis);
    }
}
