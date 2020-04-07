package com.hgdiv.opendata.repository;

import com.hgdiv.opendata.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long> {

    List<Artist> findAllByName(String name);


}
