package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.*;

import java.util.List;

/**
 * The interface Search service.
 *
 * @author HGDIV
 */
public interface SearchService {

    /**
     * Gets top five tracks.
     *
     * @param artistId the artist id
     * @return the top five tracks
     */
    List<Track> getTopFiveTracks(int artistId);

    /**
     * Search artist artists.
     *
     * @param artistName the artist name
     * @return the artists
     * @throws Exception the exception
     */
    Artists searchArtist(String artistName) throws Exception;

    /**
     * Gets albums by artist.
     *
     * @param artistName the artist name
     * @return the albums by artist
     */
    Albums getAlbumsByArtist(String artistName);

    /**
     * Gets albums by artist id.
     *
     * @param artistId the artist id
     * @return the albums by artist id
     * @throws Exception the exception
     */
    Albums getAlbumsByArtistId(Integer artistId) throws Exception;



}
