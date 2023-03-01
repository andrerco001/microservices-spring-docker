package ca.java.person.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import ca.java.person.model.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();

	public Person findById(Long id) {
		Person person = new Person(counter.incrementAndGet(), "Jean", "Jean", "Montréal, QC", "homme");
		return person;
	}
}