package com.hgdiv.opendata.model;

import java.net.URL;


/**
 * The type Search.
 *
 * @author HGDIV  <p> Possible values : RANKING, TRACK_ASC, TRACK_DESC, ARTIST_ASC, ARTIST_DESC, ALBUM_ASC, ALBUM_DESC, RATING_ASC, RATING_DESC, DURATION_ASC, DURATION_DESC </p>
 */
public class Search {

    /***********************************************************
     StuckInMyHead Vars
     ***********************************************************/

    private Long id; //Local repository id
    private String userInput;

    /***********************************************************
     Deezer
     ***********************************************************/
    private String searchOrder;
    /**
     * The Deezer id.
     */
    public Integer deezerId; //The track's Deezer id
    /**
     * The Readable.
     */
    public Boolean readable; //true if the track is readable in the player for the current user
    /**
     * The Title.
     */
    public String title; //The track's full title
    /**
     * The Title short.
     */
    public String title_short; //The track's short title
    /**
     * The Title version.
     */
    public String title_version; // The track version
    /**
     * The Link.
     */
    public String link; // The url of the track on Deezer
    /**
     * The Duration.
     */
    public Integer duration; // The track's duration in seconds
    /**
     * The Rank.
     */
    public Integer rank; // The track's Deezer rank
    /**
     * The Explicit lyrics.
     */
    public Boolean explicit_lyrics; //Whether the track contains explicit lyrics
    /**
     * The Preview.
     */
    public URL preview; // The url of track's preview file. This file contains the first 30 seconds of the track

    /*
    artist object containing : id, name, link, picture, picture_small,
                                    picture_medium, picture_big, picture_xl
     */

    private Artist artist;

    /*
    album object containing : id, title, cover, cover_small, cover_medium, cover_big, cover_xl
     */
    private Album album;


    /**
     * Instantiates a new Search.
     */
    public Search(){
        super();
    }


    /**
     * Instantiates a new Search.
     *
     * @param userInput the user input
     */
    public Search(String userInput) {
        this.userInput = userInput;

    }

    /**
     * Instantiates a new Search.
     *
     * @param userInput   the user input
     * @param searchOrder the search order
     */
    public Search(String userInput,String searchOrder) {
        this.userInput = userInput;
        this.searchOrder = searchOrder;

    }


    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets deezer id.
     *
     * @return the deezer id
     */
    public Integer getDeezerId() {
        return deezerId;
    }

    /**
     * Sets deezer id.
     *
     * @param deezerId the deezer id
     */
    public void setDeezerId(Integer deezerId) {
        this.deezerId = deezerId;
    }

    /**
     * Is readable boolean.
     *
     * @return the boolean
     */
    public Boolean isReadable() {
        return readable;
    }

    /**
     * Sets readable.
     *
     * @param readable the readable
     */
    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets title short.
     *
     * @return the title short
     */
    public String getTitle_short() {
        return title_short;
    }

    /**
     * Sets title short.
     *
     * @param title_short the title short
     */
    public void setTitle_short(String title_short) {
        this.title_short = title_short;
    }

    /**
     * Gets title version.
     *
     * @return the title version
     */
    public String getTitle_version() {
        return title_version;
    }

    /**
     * Sets title version.
     *
     * @param title_version the title version
     */
    public void setTitle_version(String title_version) {
        this.title_version = title_version;
    }

    /**
     * Gets link.
     *
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Gets rank.
     *
     * @return the rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * Sets rank.
     *
     * @param rank the rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * Is explicit lyrics boolean.
     *
     * @return the boolean
     */
    public Boolean isExplicit_lyrics() {
        return explicit_lyrics;
    }

    /**
     * Sets explicit lyrics.
     *
     * @param explicit_lyrics the explicit lyrics
     */
    public void setExplicit_lyrics(Boolean explicit_lyrics) {
        this.explicit_lyrics = explicit_lyrics;
    }

    /**
     * Gets preview.
     *
     * @return the preview
     */
    public URL getPreview() {
        return preview;
    }

    /**
     * Sets preview.
     *
     * @param preview the preview
     */
    public void setPreview(URL preview) {
        this.preview = preview;
    }

    /**
     * Gets artist.
     *
     * @return the artist
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * Sets artist.
     *
     * @param artist the artist
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /**
     * Gets album.
     *
     * @return the album
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Sets album.
     *
     * @param album the album
     */
    public void setAlbum(Album album) {
        this.album = album;
    }


    /**
     * Gets user input.
     *
     * @return the user input
     */
    public String getUserInput() {
        return userInput;
    }

    /**
     * Sets user input.
     *
     * @param nameOfArtist the name of artist
     */
    public void setUserInput(String nameOfArtist) {
        this.userInput = nameOfArtist;
    }

    /**
     * Gets search order.
     *
     * @return the search order
     */
    public String getSearchOrder() {
        return searchOrder;
    }

    /**
     * Sets search order.
     *
     * @param searchOrder the search order
     */
    public void setSearchOrder(String searchOrder) {
        this.searchOrder = searchOrder;
    }

    @Override
    public String toString() {
        return "Search{" +
                "id=" + id +
                ", userInput='" + userInput + '\'' +
                ", searchOrder='" + searchOrder + '\'' +
                ", deezerId=" + deezerId +
                ", readable=" + readable +
                ", title='" + title + '\'' +
                ", title_short='" + title_short + '\'' +
                ", title_version='" + title_version + '\'' +
                ", link='" + link + '\'' +
                ", duration=" + duration +
                ", rank=" + rank +
                ", explicit_lyrics=" + explicit_lyrics +
                ", preview=" + preview +
                ", artist=" + artist +
                ", album=" + album +
                '}';
    }



}
