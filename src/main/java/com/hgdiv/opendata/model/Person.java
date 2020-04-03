package com.hgdiv.opendata.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Person {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String description;
	
	private @Version @JsonIgnore Long version;

	public Person() {
	}

	public Person(String firstName, String lastName, String description) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;

	}

	public Person(Long id, String lastName) {
		this.lastName = lastName;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person person = (Person) obj;
		return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName)
				&& Objects.equals(lastName, person.lastName) && Objects.equals(description, person.description);

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, description);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String genre) {
		this.description = genre;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", genre='" + description + '\'' + '}';
	}

}
