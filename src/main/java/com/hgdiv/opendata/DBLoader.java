package com.hgdiv.opendata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBLoader implements CommandLineRunner {
	
	private final WorkingRepository repository;
	
	@Autowired
	public DBLoader(WorkingRepository repository) {
		this.repository = repository;
	}
	

	@Override
	public void run(String... args) throws Exception {
	this.repository.save(new Artist("Cat","Stevens","70's Folk-Rock"));	
	this.repository.save(new Artist("Fats","Domino","Soul and Blues"));	
	this.repository.save(new Artist("Madonna","blank","Alternative/Pop"));	
	this.repository.save(new Artist("Micheal","Jackson","Pop"));	
	this.repository.save(new Artist("Rolling","Stones","Classic Rock"));
	}
	
}
