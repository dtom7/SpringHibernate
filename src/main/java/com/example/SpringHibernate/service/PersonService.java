package com.example.SpringHibernate.service;

import com.example.SpringHibernate.domain.Person;

public interface PersonService {
	
	void createPerson(Person person);
	void updatePerson(Person person);
	void getPerson(long id);
	void deletePerson(long id);

}
