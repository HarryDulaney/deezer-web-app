package com.hgdiv.roster;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artist {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String genre;

	private Artist() {
	}

	public Artist(String firstName, String lastName, String genre) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.genre = genre;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Artist artist = (Artist) obj;
		return Objects.equals(id, artist.id) && Objects.equals(firstName, artist.firstName)
				&& Objects.equals(lastName, artist.lastName) && Objects.equals(genre, artist.genre);

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, genre);
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Artist{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", genre='" + genre + '\'' + '}';
	}

}
