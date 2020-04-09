package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.model.Track;
import com.hgdiv.opendata.repository.SearchRepository;
import com.hgdiv.opendata.utils.UrlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@Service("searchService")
public class SearchServiceImpl implements SearchService {

    private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    private SearchRepository searchRepository;

    @Autowired
    public SearchServiceImpl(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @Override
    public List<Search> findAllByName(String name) {
        return searchRepository.findAllByUserInput(name);

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
    public Artist searchArtist(String artistName) {
        String urlQuery = UrlUtils.buildStrArtistSearchQuery(artistName);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(urlQuery, Artist.class);


    }

    @Override
    public List<Album> getAlbumsByArtist(String artistName) {
        return null;
    }

    @Override
    public Search saveSearch(Search search) throws AssertionError {

        assert search.getUserInput() != null;
        return searchRepository.save(search);

    }


}
