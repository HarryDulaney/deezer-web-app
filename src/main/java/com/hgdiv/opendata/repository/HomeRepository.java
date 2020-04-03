package com.hgdiv.opendata.repository;

import com.hgdiv.opendata.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface HomeRepository extends JpaRepository<Person, Long> {

    List<Person> findAllByFirstNameAndLastName(String firstName,String LastName);

}
