package io.github.kprasad99.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kprasad99.orm.dao.PersonDao;
import io.github.kprasad99.orm.model.Person;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	
	public List<Person> list(){
		log.info("Retrieving person data from DB");
		return personDao.findAll();
	}
}
