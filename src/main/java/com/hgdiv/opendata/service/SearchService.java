package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.model.Track;

import java.util.List;

public interface SearchService {

    List<Search> findAllByName(String name);

    Search findById(Long id);

    List<Track> getTopFiveTracks(int artistId); //https://api.deezer.com/artist/27/

    List<Artist> searchArtist(String artistName); //https://api.deezer.com/search/artist?q=eminem

    List<Album> getAlbumsByArtist(String artistName); //https://api.deezer.com/search/album?q=eminem


}
