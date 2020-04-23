package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.*;

import java.util.List;

public interface SearchService {

    List<Track> getTopFiveTracks(int artistId);

    Artist searchArtist(String artistName);

    Albums getAlbumsByArtist(String artistName);

    Albums getAlbumsByArtistLink(String artistLink);



}
