package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.*;

import java.util.List;

public interface SearchService {

    List<Track> getTopFiveTracks(int artistId);

    Artist searchArtist(String artistName) throws Exception;

    Albums getAlbumsByArtist(String artistName);

    Albums getAlbumsByArtistId(Integer artistId) throws Exception;



}
