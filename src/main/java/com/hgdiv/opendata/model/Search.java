package com.hgdiv.opendata.model;

import java.net.URL;


/**
 * <p>
 * Optional Parameters for filtering resulting JSON
 * Possible values : RANKING, TRACK_ASC, TRACK_DESC, ARTIST_ASC, ARTIST_DESC, ALBUM_ASC,
 * ALBUM_DESC, RATING_ASC, RATING_DESC, DURATION_ASC, DURATION_DESC
 * </p>
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
    public Integer deezerId; //The track's Deezer id
    public Boolean readable; //true if the track is readable in the player for the current user
    public String title; //The track's full title
    public String title_short; //The track's short title
    public String title_version; // The track version
    public String link; // The url of the track on Deezer
    public Integer duration; // The track's duration in seconds
    public Integer rank; // The track's Deezer rank
    public Boolean explicit_lyrics; //Whether the track contains explicit lyrics
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



    public Search(){
        super();
    }


    public Search(String userInput) {
        this.userInput = userInput;

    }

    public Search(String userInput,String searchOrder) {
        this.userInput = userInput;
        this.searchOrder = searchOrder;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDeezerId() {
        return deezerId;
    }

    public void setDeezerId(Integer deezerId) {
        this.deezerId = deezerId;
    }

    public Boolean isReadable() {
        return readable;
    }

    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_short() {
        return title_short;
    }

    public void setTitle_short(String title_short) {
        this.title_short = title_short;
    }

    public String getTitle_version() {
        return title_version;
    }

    public void setTitle_version(String title_version) {
        this.title_version = title_version;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean isExplicit_lyrics() {
        return explicit_lyrics;
    }

    public void setExplicit_lyrics(Boolean explicit_lyrics) {
        this.explicit_lyrics = explicit_lyrics;
    }

    public URL getPreview() {
        return preview;
    }

    public void setPreview(URL preview) {
        this.preview = preview;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }


    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String nameOfArtist) {
        this.userInput = nameOfArtist;
    }

    public String getSearchOrder() {
        return searchOrder;
    }

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
