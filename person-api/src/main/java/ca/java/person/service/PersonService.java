package ca.java.person.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import ca.java.person.model.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person findById(Long id) {
		Person person = new Person(counter.incrementAndGet(), "Jean", "Jean", "Montréal, QC", "homme");
		return person;
	}

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;

	}

	private Person mockPerson(int i) {
		return new Person(counter.incrementAndGet(), "First Name " + i, "Last Name " + i, "Some Address " + i, "Gender");
	}
}