package io.github.kprasad99.orm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person {

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
}
