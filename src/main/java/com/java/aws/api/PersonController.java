package com.java.aws.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/")
    public String helloWorld(){
        return "HelloWorld";
    }

    @GetMapping("/persons")
    public List<PersonEntity> consultarPessoa(){
        return personRepository.findAll();
    }

    @GetMapping("/persons/{id}")
    public Optional<PersonEntity> consultarPessoaPorId(@PathVariable Long id){
    return personRepository.findById(id);
    }

    @PostMapping("/save")
    public PersonEntity salvarPessoa(@RequestBody PersonEntity personEntity){
        return personRepository.save(personEntity);
    }



}
