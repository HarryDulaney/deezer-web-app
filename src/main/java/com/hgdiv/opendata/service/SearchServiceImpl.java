package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.model.Track;
import com.hgdiv.opendata.repository.SearchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.hgdiv.opendata.model.Artist.buildArtistQuery;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

   private static final Logger logger = LoggerFactory.getLogger(RestServiceImpl.class);
    private RESTService restService;
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
    public Artist searchArtist(String artistName) {
        try {
         String urlQuery = buildArtistQuery(artistName);



        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public List<Album> getAlbumsByArtist(String artistName) {
        return null;
    }

    @Override
    public Search saveSearch(Search search) throws AssertionError {

        assert search != null;
        return searchRepository.save(search);

    }
    @Autowired
    private void initRestService(RESTService restService){
        this.restService = restService;
    }
}