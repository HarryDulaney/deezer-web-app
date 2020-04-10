package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.model.Track;

import java.util.List;

public interface SearchService {

    List<Track> getTopFiveTracks(int artistId);

    Artist searchArtist(String artistName);

    List<Album> getAlbumsByArtist(String artistName);



}
