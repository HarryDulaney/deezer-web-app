package com.hgdiv.opendata.repository;

import com.hgdiv.opendata.model.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends JpaRepository<Search,Long> {

    List<Search> findAllByName(String nameOfArtist);


}
