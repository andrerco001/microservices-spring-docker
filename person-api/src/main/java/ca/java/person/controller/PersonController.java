package ca.java.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.java.person.model.Person;
import ca.java.person.service.PersonService;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@PostMapping
	public Person create(@RequestBody Person person) {
		return service.create(person);
	}

	@GetMapping("/{id}")
	public Person findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<Person> findAll() {
		return service.findAll();
	}
}