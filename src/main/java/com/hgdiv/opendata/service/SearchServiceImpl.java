package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.model.Track;
import com.hgdiv.opendata.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchServiceImpl implements SearchService {

    private SearchRepository searchRepository;

    @Autowired
    public SearchServiceImpl(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @Override
    public List<Search> findAllByName(String name) {
        return searchRepository.findAllByName(name);

    }

    @Override
    public Search findById(Long id) {
        Optional<Search> artist = searchRepository.findById(id);
        return artist.orElseGet(Search::new);


    }

    @Override
    public List<Track> getTopFiveTracks(int artistId) {
        return null;
    }

    @Override
    public List<Artist> searchArtist(String artistName) {
        return null;
    }

    @Override
    public List<Album> getAlbumsByArtist(String artistName) {
        return null;
    }

}
