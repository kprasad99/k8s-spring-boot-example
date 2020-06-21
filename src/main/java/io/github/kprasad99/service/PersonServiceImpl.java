package io.github.kprasad99.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kprasad99.orm.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

@Service
public class PersonServiceImpl {

	@Autowired
	private io.github.kprasad99.orm.service.PersonService personDao;


	public Flux<Person> get() {
		return Flux.fromIterable(personDao.list()).subscribeOn(Schedulers.elastic());
	}
	
}
