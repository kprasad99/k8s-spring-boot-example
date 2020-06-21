package io.github.kprasad99.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/person")
public class PersonRestService {

	@Autowired
	private PersonServiceImpl ps;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<io.github.kprasad99.orm.model.Person> get() {
		return ps.get();
	}

}
