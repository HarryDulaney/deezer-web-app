package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.*;

import java.util.List;

/**
 * The interface Search service.
 *
 * @author HGDIV
 */
public interface APIService {

    /**
     * Gets top five tracks.
     *
     * @param artistId the artist id
     * @return the top five tracks
     */
    List<Track> getTopFiveTracks(int artistId);

    /**
     * Search artist
     *
     * @param artistName the artist name
     * @return the artists returned by the search query
     * @throws Exception the exception
     */
    Artists searchArtist(String artistName) throws Exception;

    /**
     * Gets album by album id.
     *
     * @param albumId the album id
     * @return the album by album id
     * @throws Exception the exception
     */
    Album getAlbumByAlbumId(Integer albumId) throws Exception;
    /**
     * Gets albums by artist id.
     *
     * @param artistId the artist id
     * @return the artists albums
     * @throws Exception the exception
     */
    Albums getAlbumsByArtistId(Integer artistId) throws Exception;



}
